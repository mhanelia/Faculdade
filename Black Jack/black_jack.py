"""Lógica do BlackJack."""
import random
from os import system as system_call



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
        system_call("cls")
        return cards

    def hit(self, mao):
        # system_call("cls")
        mao.append(self.deck[:1])
        del self.deck[:1]
        # system_call("cls")

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


    def show_hand(self, name, cards, point):
        print("Jogador: {} - Cartas {}; Pontos {}".format(name,cards,point))


    def bet(self,pc, player):

        if((pc < 21) and (player < 21)):
            if (player == pc):
                print("Empate!".format(pc))
            elif (player > pc):
                print("Vencedor: Murilo Pontos: {} ".format(player))
            elif (pc > player):
                print("Vencedor: Maquina Pontos: {} ".format(pc))
        else:
            print("Os dois estouraram!")






#         for i in range(0, len(hand)):
#             print("Jogador: {} - Cartas {}; Pontos {}".format(points,points,points))
#
# print("Vencedor: {}".format(points.index(max(points))))
