class Configuracao:
    _instancia = None
    def __init__(self, valor = "Configuracao Padrao"):
        self.valor = valor

    def __new__(config):
        if config._instancia is None:
            config._instancia = super(Configuracao, config).__new__(config)
        return config._instancia
