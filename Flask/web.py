""" Exemplo flask """

from flask import Flask

app = Flask('web') #nome do arquivo que eu quero instanciar

@app.route('/')
def index():
    return 'Sou a página principal!'

@app.route('/ola/<nome>')
def ola(nome):
    return 'Olá {}!'.format(nome)

@app.route('/ola/<int:idade>')
def idade(idade):
    return 'Olá {}!'.format(idade)

app.run(debug=True, use_reloader=True)
