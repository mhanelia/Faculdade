"""Lógica do BlackJack."""
import random
from os import system as system_call



class Fodinha(object):
    """Classe que implementa a Lógica do BlackJack."""

    def __init__(self):
        """Método construtor da classe."""
        self.numbers = ['0', "4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"]
        self.suits =   ['0', "♦", "♠", "♥", "♣"]
        self.appendHand = []
        self.deck = self.create_deck()
        self.round = 1


    def create_deck(self):
         """Método que cria o baralho"""
         numbers = ["4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"]
         suits =   ["♦", "♠", "♥", "♣"]
         deck = []
         for i in numbers:
             for x in suits:
                 deck.append(i+x)

         return deck

    def shuffle(self):
        """Método que embaralha o baralho"""
        random.shuffle(self.deck)

    def hand(self):
        """Distribui a quantidade de cartas de acordo com o round"""
        self.appendHand = []
        hand = []
        hand.append(self.deck[:self.round])
        del self.deck[:self.round]

        return hand

    def f_round(self):
        """Incrementa o round para a próxima jogada"""
        self.round = self.round + 1

    def table(self):
        """Define a carta que estará na mesa"""
        self.table = []
        self.table.append(self.deck[:1])
        del self.deck[:1]
        return self.table


    def f_appendHand(self, mao):
        self.appendHand.append(mao)

    def compare(self):

        for itens in self.appendHand:
            for n in itens:
                if '♦' in n[1]:
                    if numbers.index(n[0]) == numbers.index(self.table[0]) + 1 :
                        res = ((ord('♦') - 7)) * numbers.index(n[0]) * 2000
                        lista.append(res)
                    else:
                        res = ((ord('♦') - 7)) * numbers.index(n[0])
                        lista.append(res)

                elif '♠' in n[1]:
                        if numbers.index(n[0]) == numbers.index(self.table[0]) + 1 :
                            res = (ord('♠')) * numbers.index(n[0]) * 2000
                            lista.append(res)
                        else:
                            res = (ord('♠')) * numbers.index(n[0])
                            lista.append(res)

                elif '♥' in n[1]:
                    if numbers.index(n[0]) == numbers.index(self.table[0]) + 1 :
                        res = ((ord('♥') - 4)) * numbers.index(n[0]) * 2000
                        lista.append(res)
                    else:
                        res = ((ord('♥') - 4)) * numbers.index(n[0])
                        lista.append(res)

                elif '♣' in n[1]:
                    if numbers.index(n[0]) == numbers.index(self.table[0]) + 1 :
                        res = (ord('♣') - 1) * numbers.index(n[0]) * 2000
                        lista.append(res)
                    else:
                        res = (ord('♣') - 1) * numbers.index(n[0])
                        lista.append(res)

        best = appendHand[lista.index(max(lista))]

        print("Melhor carta: {}".format(best))
