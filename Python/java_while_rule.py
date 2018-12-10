import bblfsh

from bblfsh import filter as filter_uast

def rule_chk(uast):
        findings = []
        is_left_literal = False
        is_right_literal = False

        left_node_pos = None
        right_node_pos = None

        #query = "//WhileStatement//InfixExpression"
        #query = "//*[@roleWhile and @roleBinary and @roleCondition and  @roleExpression]"
        #query = "//*[@roleWhile and @roleStatement and not(@roleBody)]"
        query = "//*[@roleWhile and @roleStatement and not(@roleBody)]//*[@roleRelational and @roleExpression and @roleBinary and @roleOperator] "
        print(query)
        node = filter_uast(uast,query)
        i =0
        for n in node:
            i = i + 1
            print('Node :{0}'.format(i) )
            is_left_literal = False
            is_right_literal = False

            left_node_pos = None
            right_node_pos = None
            
            j = 0          
            for child  in n.children:
                j= j + 1
                print('Iteration {0} for node {1} '.format(j,i)) 
                #print(child)

               
                if ( bblfsh.role_id("NUMBER") in child.roles ) &   ( bblfsh.role_id("LEFT") in child.roles  )  :
                        is_left_literal = True
                        left_node_pos = child.start_position.line

                if ( bblfsh.role_id("NUMBER") in child.roles ) &   ( bblfsh.role_id("RIGHT") in child.roles  )  :
                        is_right_literal = True
                        right_node_pos = child.start_position.line

            if is_left_literal & is_right_literal :
                findings.append({"msg": "Number literals found in while condition",
                            "left literal at line": left_node_pos,
                            "right literal at line":right_node_pos})

        return findings
