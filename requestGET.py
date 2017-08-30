import sys
import requests
class subdomains(object):
    """docstring for getSubdomains."""
    def __init__(self, file_hosts, target):
        self.file_hosts = file_hosts
        self.target = target

def getSubdomains(target, file_hosts):
    target = target.split("//")
    file_hosts = "hosts.txt"

    list = []
    for host in open(file_hosts, 'r'):
        host = host.replace("\n", ".")
        list.append(target[0] +  "//" + host + target[1])

    for i in list:
        print(i)
        r = requests.get(i)
        print(r.status_code)

getSubdomains("http://ite.edu.br", "hosts.txt" )
