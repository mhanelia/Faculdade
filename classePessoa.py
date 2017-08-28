# Classe pessoa com o método fala

class Pessoa(object):
    #Os métodos da classe sempre receberão self como parâmetro

    #Método construtor da classe, recebe nome e idade
    def __init__(self, nome, idade):

        #Inicializa as variáveis que serão utilizadas
        #pelos métodos da classe Pessoa (e somente por eles)
        self.nome = nome
        self.idade = idade

    #Método fala
    def fala(self):
        print("Olá! Eu sou {}, tenho {} anos e estou falando!".format(self.nome, self.idade))

###################################

#Instanciando a classe Pessoa, utilizando um objeto chamado Pessoa
#desta forma, pessoa (diferente de Pessoa), passa a ser um obejto
#de uma classe. Vejamos:

pessoa = Pessoa("Murilo", 22)

#Invocando o método fala da classe Pessoa:

pessoa.fala()
