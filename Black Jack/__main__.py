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

dic_points = {"Murilo":str(b.get_point(player_hand)), "Maquina":str(b.get_point(pc_hand))}
dic_hand = {"Murilo":str(player_hand), "Maquina":str(pc_hand)}

# player_hand = 15
# pc_hand = 20
dic_hand = {"Murilo":str(player_hand), "Maquina":str(pc_hand)}





b.bet(dic_hand,dic_points)



# b.bet(max(dic, key=dic.get), "Murilo",player_hand, b.get_point(player_hand))
# b.bet(max(dic, key=dic.get),"Maquina",pc_hand, b.get_point(pc_hand))
