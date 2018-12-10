import bblfsh
import sys

from bblfsh import filter as filter_uast
if __name__ == "__main__":

        #Initializing the babelfish client
	client = bblfsh.BblfshClient("0.0.0.0:9432")
	response = client.parse(sys.argv[1])
	
	node = filter_uast(response.uast,"//WhileStatement//InfixExpression//NumberLiteral")
	node = filter_uast(node,"//[@role='Left']")
	
	if n in node :
		print(n)
