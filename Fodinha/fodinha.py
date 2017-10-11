"""Lógica do BlackJack."""
import random
from os import system as system_call



class Fodinha(object):
    """Classe que implementa a Lógica do BlackJack."""

    def __init__(self):
        """Método construtor da classe."""
        self.numbers = ["4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"]
        self.nweight = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10"]
        self.suits =   ["♦", "♠", "♥", "♣"]
        self.sweight = ["1", "2", "3", "4"]

        self.deck = self.create_deck()
        self.round = 1

    def create_deck(self):
      """Método que cria o baralho"""
      deck = []
      for i in self.numbers:
          for x in self.suits:
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

self.numbers = ["4", "5", "6", "7", "Q", "J", "K", "A", "2", "3"]
self.suits =   ["♦", "♠", "♥", "♣"]

suits =   ["♦", "♠", "♥", "♣"]
mao = [['4♣', '2♦', "5♥"]]
mesa = [['4♠']]
count = 0
for item in mao:
    for card in item:
        m1 = mesa[0]
        m2 = m1[0]
        print(card)
        print(m2)
        if suits.index(card[1]) > suits.index(m2[1]):
            count = count + 1

print(count)
