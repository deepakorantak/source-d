import bblfsh

from bblfsh import filter as filter_uast

def rule_chk(uast):
	findings = []
	
	query = "//TypeDeclaration[@interface='true']//FieldDeclaration"
	nodes = filter_uast(uast,query)
	for n in nodes:
		#print(n)
		 findings.append({"msg": "Interface should not define a constant",
                         "pos": n.start_position})

	
	return findings

