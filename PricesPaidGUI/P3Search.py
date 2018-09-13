#Here we will track the USER searches based on the session that is created for him. It works similar to auth.py
GLOBAL_SEARCH_DICT = {}

def check_search_list(sessionid,search_string,mainsearch):
    print 'check_search_list sessionid = {0} , search_string = {1}, mainsearch = {2}'.format(sessionid,search_string,mainsearch)
    if sessionid in GLOBAL_SEARCH_DICT:
	if mainsearch == "Y":
	    delete_search_list(sessionid)
	    create_search_list(sessionid,search_string)
	else:
	    update_search_list(sessionid,search_string)
    else:
	create_search_list(sessionid,search_string)
    return get_search_list(sessionid)

def create_search_list(sessionid,search_string):
    print 'create_search_list'
    GLOBAL_SEARCH_DICT[sessionid] = [search_string]
    print 'create = ', GLOBAL_SEARCH_DICT

def update_search_list(sessionid,search_string):
    print 'update_search_list'
    GLOBAL_SEARCH_DICT[sessionid].append(search_string)
    print 'update = ', GLOBAL_SEARCH_DICT

def delete_search_list(sessionid):
    print 'delete_search_list'
    GLOBAL_SEARCH_DICT[sessionid] = None
    print 'delete = ', GLOBAL_SEARCH_DICT

def get_search_list(sessionid):
    print 'get_search_list'
    return ' && '.join(GLOBAL_SEARCH_DICT[sessionid])


#check_search_list(1234,'prem','Y')
#print GLOBAL_SEARCH_DICT
#print check_search_list(1234,'anand','N')
#print check_search_list(1234,'dev','N')
#check_search_list(1234,'viya','Y')
#print GLOBAL_SEARCH_DICT
