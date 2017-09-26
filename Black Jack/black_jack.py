"""Lógica do BlackJack."""
import random
import os



class BlackJack(object):
    """Classe que implementa a Lógica do BlackJack."""

    def __init__(self):
        """Método construtor da classe."""
        self.numbers = ["A", "2", "3", "4", "5", "6", "7",
                        "8", "9", "10", "Q", "J", "K"]

        self.suits = ["♣", "♦", "♥", "♠"]

        self.deck = self.create_deck()

    def create_deck(self):
      deck = []
      for i in self.numbers:
          for x in self.suits:
              deck.append(i+x)
      return deck

    def shuffle(self):
        random.shuffle(self.deck)

    def two_first_cards(self):
        cards = []
        cards.append(self.deck[:2])
        del self.deck[:2]
        # del self.deck[self.deck.index(cards[0])]

        # del self.deck[self.deck.index(cards[1])]
        return cards

    def hit(self, mao):
        mao.append(self.deck[:1])
        del self.deck[:1]

        return mao


    def get_point(self, mao):
        point = 0
        for item in mao:
            for card in item:
                card = card.replace("♣","").replace("♦","").replace("♥","").replace("♠","")
                if (card == "Q" or card == "J" or card == "K" ):
                    point = point + 10

                elif (card == "A"):
                    point = point + 1

                else:
                    point = point + int(card)

        return point


    def show_hand(self, player, point):
        print("Cartas {}; Pontos {}".format(player,point))

    def bet(self, pc, point):
        print("Cartas {}; Pontos {}".format(pc,point))
