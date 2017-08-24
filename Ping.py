from platform import system as sys_name #retorna o nome do SO
from os import system as system_call       # Executa o shell no comando

def ping(host):
    """
    Retorna True se o host (str) rsponde a requisição do ping.
    Lembre-se de que alguns hosts podem não responder a um pedido de ping mesmo se o nome do host for válido.
    """

    # Parâmetros Ping como função do SO
    parameters = "-n 1" if system_name().lower()=="windows" else "-c 1"

    # Pingando
    return system_call("ping " + parameters + " " + host) == 0
