playersQnt = int(input("Quantos jogadores estão nessa partida? "))
players = []
i = 1
while i <= playersQnt:
    players.append(input("Nome do jogador {}: ".format(i)))
    i = i + 1

deckQnt = int(input("Com quantos baralhos desejam jogar: "))

players = ["Murilo","Willian"]

shuffle()
f_table()
for i in players:
    i = hand()

print(Willian)
for i in players:
    print("Mão de {}: {}".format(i, ))

"""Lógica do jogo Fodinha."""
import random


def __init__(qnt):
    """Método construtor da classe."""
    numbers = ['0', "4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"]
    suits = ['0', "♦", "♠", "♥", "♣"]
    appendHand = [] #todas as cartas selecionadas por cada jogador para jogar na rodada atual
    deck_qtn = deckQnt #quantidade de baralhos durante a partida
    deck = create_deck() #cria o deck
    round = 3 #define em aual partida está

def create_deck():
    """Método que cria o baralho"""
    deck = []
    for i in numbers[1:]:
        for x in suits[1:]:
            deck.append(i+x)

    return deck * deck_qtn

def shuffle():
    """Método que embaralha o baralho"""
    random.shuffle(deck)
    print(deck)

def hand():
    """Distribui a quantidade de cartas de acordo com o round
       e retorna a mão para o usuário"""
    appendHand = []
    hand = []
    hand.append(deck[:3])
    del deck[:3]
    hand = hand[0]
    return hand

def f_round():
    """Incrementa o round para a próxima jogada"""
    round = round + 1

def f_table():
    """Define a carta que estará na mesa"""
    table = []
    table.append(deck[:1])
    del deck[:1]

def f_appendHand(mao):
    """Adiciona a primeira carta da mão ao jogo"""
    appendHand.append(mao)

def compare():
    """Realiza a comparação dos pesos das cartas
       e define a carta vencedora da rodada"""
    table = table[0]
    table = table[0] # remove da lista ao invés de usar um for
    print(appendHand)
    lista = []
    lista2 = []
    for n in appendHand:
        lista2.append(n)
        if '♦' in n[1]:
            if (n[0] == '4' and table[0] == '3') or numbers.index(n[0]) == numbers.index(table[0]) + 1:
                res = ((ord('♦') - 7)) * numbers.index(n[0]) * 2000

            else:
                res = ((ord('♦') - 7)) * numbers.index(n[0])
            lista.append(res)

        elif '♠' in n[1]:
                if (n[0] == '4' and table[0] == '3') or numbers.index(n[0]) == numbers.index(table[0]) + 1:
                    res = (ord('♠')) * numbers.index(n[0]) * 2000

                else:
                    res = (ord('♠')) * numbers.index(n[0])
                lista.append(res)

        elif '♥' in n[1]:
            if (n[0] == '4' and table[0] == '3') or numbers.index(n[0]) == numbers.index(table[0]) + 1:
                res = ((ord('♥') - 4)) * numbers.index(n[0]) * 2000

            else:
                res = ((ord('♥') - 4)) * numbers.index(n[0])
            lista.append(res)

        elif '♣' in n[1]:
            if (n[0] == '4' and table[0] == '3') or numbers.index(n[0]) == numbers.index(table[0]) + 1:
                res = (ord('♣') - 1) * numbers.index(n[0]) * 2000

            else:
                res = (ord('♣') - 1) * numbers.index(n[0])
            lista.append(res)

    print("Mesa: {}".format(table))
    print("Mão 1: {} ---- Mão 2: {} ---- Mão 3: {}".format(appendHand[0], appendHand[1], appendHand[2]))
    best = lista2[lista.index(max(lista))]

    print("\nMelhor carta: {}".format(best))

def r_hand(player, rem):
    """Realiza o descarte da carta jogada"""
    del player[rem]
    return player
