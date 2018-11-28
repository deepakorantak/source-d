import bblfsh
import sys

from bblfsh import filter as filter_uast
from java_sonar_rule_RSPEC_1214 import rule_chk as rule_chk

if __name__ == "__main__":
	
	#Initializing the babelfish client
	client = bblfsh.BblfshClient("0.0.0.0:9432")
	response = client.parse(sys.argv[1])
	
	if response.status != 0:
		raise Exception('Some error happened: ' + str(response.errors))
	
	
	findings = rule_chk(response.uast)	
	print(findings)

	
