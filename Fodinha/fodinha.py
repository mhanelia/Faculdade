"""Lógica do BlackJack."""
import random
from os import system as system_call



class Fodinha(object):
    """Classe que implementa a Lógica do BlackJack."""

    def __init__(self):
        """Método construtor da classe."""
        self.numbers = ["4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"]
        self.suits =   ["♦", "♠", "♥", "♣"]

        self.deck = self.create_deck()
        self.round = 1

    def create_deck():
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
        """Distribui as cartas de acordo com o round"""
        hand = []
        hand.append(self.deck[:self.round])
        del self.deck[:self.round]

        return hand

    def f_round(self):
        """Incrementa o round para a próxima jogada"""
        self.round = self.round + 1

    def table(self):
        """Define a carta que estará na mesa"""
        table = []
        table.append(self.deck[:1])
        del self.deck[:1]

        return table

    def compare(self, mao, mesa):

        lista = []
        for n in mao:

            if '♦' in n[1]:
                if int(n[0]) == int(mesa[0]) + 1:
                    res = ((ord('♦') - 7)) * numbers.index(n[0]) * 2000
                    lista.append(res)
                else:
                    res = ((ord('♦') - 7)) * numbers.index(n[0])
                    lista.append(res)

            elif '♠' in n[1]:
                    if int(n[0]) == int(mesa[0]) + 1:
                        res = (ord('♠')) * numbers.index(n[0]) * 2000
                        lista.append(res)
                    else:
                        res = (ord('♠')) * numbers.index(n[0])
                        lista.append(res)

            elif '♥' in n[1]:
                if int(n[0]) == int(mesa[0]) + 1:
                    res = ((ord('♥') - 4)) * numbers.index(n[0]) * 2000
                    lista.append(res)
                else:
                    res = ((ord('♥') - 4)) * numbers.index(n[0])
                    lista.append(res)

            elif '♣' in n[1]:
                if int(n[0]) == int(mesa[0]) + 1:
                    res = (ord('♣') - 1) * numbers.index(n[0]) * 2000
                    lista.append(res)
                else:
                    res = (ord('♣') - 1) * numbers.index(n[0])
                    lista.append(res)
