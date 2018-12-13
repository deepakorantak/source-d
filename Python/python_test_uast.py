import bblfsh
import sys
import os

from bblfsh import filter as filter_uast
if __name__ == "__main__":

        #Initializing the babelfish client
	client = bblfsh.BblfshClient("0.0.0.0:9432")
	response = client.parse(sys.argv[1])
	
	node = filter_uast(response.uast,"//*[@roleFile]")
	#node = filter_uast(node,"//[@role='Left']")
	#node_list = list(node)
		
	print("Node type : ",type(node))
	
	i = 0
	for  n in node :
		i = i + 1
		#while_nodes = filter_uast(n,"//*[@roleWhile and @roleStatement]")
		#if len(list(while_nodes)) > 0 :
		#	print("While loop exists!!")

		if os.path.exists("uast.txt"):
			os.remove("uast.txt")

		with open("uast.txt","a") as f:
			f.write("{}\n".format(n))	
			
	
	
	
	print("out of loop: number of iterations :",str(i))
