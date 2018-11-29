import bblfsh

from bblfsh import filter as filter_uast

def rule_chk(uast):
        findings = []

        query = "//WhileStatement//InfixExpression"
        
        node = filter_uast(uast,query)

        for n in node:
            print(n)
            
            left_query = query + "//NumberLiteral[@role = 'Left']"
            right_query = query + "//NumberLiteral[@role = 'Right']"

            node_left = filter_uast(n,left_query)
            node_right = filter_uast(n,right_query)

            

            for l in node_left:
                print(l)
                
                for r in node_right:
                    print(r)
                    findings.append({"msg": "Number literals found in while condition",
                            "left pos": l.start_position,
                            "right_pos":r.start_position})

        return findings
