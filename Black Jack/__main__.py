"""Arquivo princial."""
from black_jack import BlackJack

b = BlackJack()
b.shuffle()
pc_hand = b.two_first_cards()
player_hand = b.two_first_cards()
b.show_hand("Murilo", player_hand, b.get_point(player_hand))

while (b.get_point(player_hand) <= 16):
    aux = input("Deseja comprar mais alguma carta? (s/n) ")
    if "sS" in aux:
        pc_hand = b.hit(player_hand)
        b.show_hand("Murilo", player_hand, b.get_point(player_hand))
    else:
        b.show_hand("Murilo", player_hand, b.get_point(player_hand))
    break

while (b.get_point(pc_hand) <= 16):
        pc_hand = b.hit(pc_hand)
        b.show_hand("Maquina", pc_hand, b.get_point(pc_hand))

b.bet("Murilo",player_hand, b.get_point(player_hand))
b.bet("Maquina",pc_hand, b.get_point(pc_hand))
