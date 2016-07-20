from flask import Flask, request
app = Flask(__name__)

@app.route('/soma')

def soma():
    numero_1 = int(request.args['numero_1'])
    numero_2 = int(request.args['numero_2'])
    resultado = numero_1 + numero_2
    return str(resultado)
@app.route('/sub')
def sub():
    numero_1 = int(request.args['numero_1'])
    numero_2 = int(request.args['numero_2'])
    resultado = numero_1 - numero_2
    return str(resultado)
@app.route('/mult')
def mult():
    numero_1 = int(request.args['numero_1'])
    numero_2 = int(request.args['numero_2'])
    resultado = numero_1 * numero_2
    return str(resultado)
@app.route('/div')
def div():
    numero_1 = int(request.args['numero_1'])
    numero_2 = int(request.args['numero_2'])
    resultado = numero_1 / numero_2
    return str(resultado)

app.run(host="192.168.10.125")
