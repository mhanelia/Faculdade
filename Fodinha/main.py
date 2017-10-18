from fodinha import Fodinha

f = Fodinha()

f.shuffle()

f.f_table()
murilo = f.hand()
maressa = f.hand()


f.f_round()

f.f_appendHand(murilo[0])
f.f_appendHand(maressa[0])

print("Murilo 0 {}".format(murilo))
print("maressa 0 {}".format(maressa))
f.compare()
