#import requests
#payload = {'username':'p3xferdt','password':'123456','file':open('/web/p3-dev.fas.gsa.gov/docs/cookedData/FUZ_EDW-pppifver-Standard-8-0-0-0-1.csv','rb')}
#r = requests.post('https://extcws.fas.gsa.gov/soatest/RESTFileAttachmentService/RESTFileIngestAPI/UploadServlet',
#        files=payload,auth=('p3xferdt','123456'))
#r = requests.post('https://soa-ext.fas.gsa.gov:443/nde/RESTFileAttachmentService/RESTFileIngestAPI/UploadServlet',
#        files=payload,auth=('p3xferdt','123456'))
#print r.status_code
#print r.text
#print r.content
#import subprocess
#process = subprocess.Popen(['gzip /tmp/dod_20141216_computers.csv'])
#process.wait()

#import gzip
#f_in = open('/tmp/dod_20141216_computers.csv','rb')
#f_out = gzip.open('/tmp/dod_20141216_computers.csv.gz','wb')
#f_out.writelines(f_in)
#f_out.close()
#f_in.close() 

import requests
payload = {'username':'p3xferdt','password':'@p3Xferdt'}
r=requests.post('https://extcws.fas.gsa.gov:443/soatest/SOAPMAuthenticationService/P3FileIngestAPIREST/RESTFileIngestAPI/CheckUserService',
	#files=payload,
	auth=('p3xferdt','@p3Xferdt'))
print r.content

