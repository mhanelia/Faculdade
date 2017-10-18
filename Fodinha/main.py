"""Main do jogo."""
from fodinha import Fodinha

playersQnt = int(input("Quantos jogadores estão nessa partida? "))
players = []
i = 1
while i <= playersQnt:
    players.append(input("Nome do jogador {}: ".format(i)))
    i = i + 1

deckQnt = int(input("Com quantos baralhos desejam jogar: "))

f = Fodinha(deckQnt)
f.shuffle()
f.f_table()
for i in players:
    pass
    i = f.hand()

print(Maressa)
for i in players:
    print("Mão de {}: {}".format(i, ))

# murilo = f.hand()
# maressa = f.hand()
# willian = f.hand()

f.f_round()
# for name in players:
#     for index in range(len(players)):
#         f.f_appendHand(name[index])
#
f.f_appendHand(maressa[0])
f.f_appendHand(willian[0])
for i in players:
    print("{}: ".format(i))
#
# print("Maressa 0 {}".format(maressa))
# print("Willian 0 {}".format(willian))



f.compare()
#
# f.r_hand(murilo,0)
# f.r_hand(maressa,0)
# f.r_hand(willian,0)
#
# print("Murilo após {}".format(murilo))
# print("Maressa após {}".format(maressa))
# print("Willian após {}".format(willian))
