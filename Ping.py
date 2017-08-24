from platform import system as sys_name #retorna o nome do SO
from os import system as system_call       # Executa o shell no comando

def ping(host):
    """
    Retorna True se o host (str) responde a requisição do ping.
    Lembre-se de que alguns hosts podem não responder a um pedido de ping mesmo se o nome do host for válido.
    """

    # Parâmetros do comando Ping como função do SO: -n numero de solicitações (1 por padrão)
    parameters = "-n 1" if sys_name().lower()=="windows" else "-c 1"

    # Pingando
    return system_call("ping " + parameters + " " + host) == 0
