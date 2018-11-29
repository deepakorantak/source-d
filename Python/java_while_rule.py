import bblfsh

from bblfsh import filter as filter_uast

def rule_chk(uast):
        findings = []
        is_left_literal = False
        is_right_literal = False

        left_node_pos = None
        right_node_pos = None

        query = "//WhileStatement//InfixExpression"
        
        node = filter_uast(uast,query)

        for n in node:
            #print(n)
            is_left_literal = False
            is_right_literal = False

            left_node_pos = None
            right_node_pos = None

            for child  in n.children:
                if ( bblfsh.role_id("NUMBER") in child.roles ) &   ( bblfsh.role_id("LEFT") in child.roles  )  :
                        is_left_literal = True
                        left_node_pos = child.start_position.line

                if ( bblfsh.role_id("NUMBER") in child.roles ) &   ( bblfsh.role_id("RIGHT") in child.roles  )  :        
                        is_right_literal = True
                        right_node_pos = child.start_position.line
               
            if is_left_literal & is_right_literal :
                findings.append({"msg": "Number literals found in while condition",
                            "left pos": left_node_pos,
                            "right_pos":right_node_pos})

        return findings
