"""Lógica do jogo Fodinha."""
import random


class Fodinha(object, ):
    """Classe que implementa a Lógica do BlackJack."""

    def __init__(self,qnt):
        """Método construtor da classe."""
        self.numbers = ['0', "4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"]
        self.suits = ['0', "♦", "♠", "♥", "♣"]
        self.appendHand = [] #todas as cartas selecionadas por cada jogador para jogar na rodada atual
        self.deck_qtn = qnt #quantidade de baralhos durante a partida
        self.deck = self.create_deck() #cria o deck
        self.round = 3 #define em aual partida está

    def create_deck(self):
        """Método que cria o baralho"""
        deck = []
        for i in self.numbers[1:]:
            for x in self.suits[1:]:
                deck.append(i+x)

        return deck * self.deck_qtn

    def shuffle(self):
        """Método que embaralha o baralho"""
        random.shuffle(self.deck)
        print(self.deck)

    def hand(self):
        """Distribui a quantidade de cartas de acordo com o round
           e retorna a mão para o usuário"""
        self.appendHand = []
        hand = []
        hand.append(self.deck[:self.round])
        del self.deck[:self.round]
        hand = hand[0]
        return hand

    def f_round(self):
        """Incrementa o round para a próxima jogada"""
        self.round = self.round + 1

    def f_table(self):
        """Define a carta que estará na mesa"""
        self.table = []
        self.table.append(self.deck[:1])
        del self.deck[:1]

    def f_appendHand(self, mao):
        """Adiciona a primeira carta da mão ao jogo"""
        self.appendHand.append(mao)

    def compare(self):
        """Realiza a comparação dos pesos das cartas
           e define a carta vencedora da rodada"""
        self.table = self.table[0]
        self.table = self.table[0] # remove da lista ao invés de usar um for
        print(self.appendHand)
        lista = []
        lista2 = []
        for n in self.appendHand:
            lista2.append(n)
            if '♦' in n[1]:
                if (n[0] == '4' and self.table[0] == '3') or self.numbers.index(n[0]) == self.numbers.index(self.table[0]) + 1:
                    res = ((ord('♦') - 7)) * self.numbers.index(n[0]) * 2000

                else:
                    res = ((ord('♦') - 7)) * self.numbers.index(n[0])
                lista.append(res)

            elif '♠' in n[1]:
                    if (n[0] == '4' and self.table[0] == '3') or self.numbers.index(n[0]) == self.numbers.index(self.table[0]) + 1:
                        res = (ord('♠')) * self.numbers.index(n[0]) * 2000

                    else:
                        res = (ord('♠')) * self.numbers.index(n[0])
                    lista.append(res)

            elif '♥' in n[1]:
                if (n[0] == '4' and self.table[0] == '3') or self.numbers.index(n[0]) == self.numbers.index(self.table[0]) + 1:
                    res = ((ord('♥') - 4)) * self.numbers.index(n[0]) * 2000

                else:
                    res = ((ord('♥') - 4)) * self.numbers.index(n[0])
                lista.append(res)

            elif '♣' in n[1]:
                if (n[0] == '4' and self.table[0] == '3') or self.numbers.index(n[0]) == self.numbers.index(self.table[0]) + 1:
                    res = (ord('♣') - 1) * self.numbers.index(n[0]) * 2000

                else:
                    res = (ord('♣') - 1) * self.numbers.index(n[0])
                lista.append(res)

        print("Mesa: {}".format(self.table))
        print("Mão 1: {} ---- Mão 2: {} ---- Mão 3: {}".format(self.appendHand[0], self.appendHand[1], self.appendHand[2]))
        best = lista2[lista.index(max(lista))]

        print("\nMelhor carta: {}".format(best))

    def r_hand(self, player, rem):
        """Realiza o descarte da carta jogada"""
        del player[rem]
        return player
