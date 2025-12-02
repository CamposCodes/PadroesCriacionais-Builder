package padroescriacao.builder;

public class BebidaBuilder {

    private Bebida bebida;

    public BebidaBuilder() {
        bebida = new Bebida();
    }

    public Bebida build() {
        if (bebida.getNome() == null || bebida.getNome().equals("")) {
            throw new IllegalArgumentException("Nome da bebida inválido");
        }
        if (bebida.getTamanho() == null || bebida.getTamanho().equals("")) {
            throw new IllegalArgumentException("Tamanho da bebida inválido");
        }
        if (bebida.getPreco() <= 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        if (bebida.getTipo() == null || bebida.getTipo().equals("")) {
            throw new IllegalArgumentException("Tipo da bebida inválido");
        }
        return bebida;
    }

    public BebidaBuilder setNome(String nome) {
        bebida.setNome(nome);
        return this;
    }

    public BebidaBuilder setTamanho(String tamanho) {
        bebida.setTamanho(tamanho);
        return this;
    }

    public BebidaBuilder setPreco(double preco) {
        bebida.setPreco(preco);
        return this;
    }

    public BebidaBuilder setTipo(String tipo) {
        bebida.setTipo(tipo);
        return this;
    }

    public BebidaBuilder setTemperatura(String temperatura) {
        bebida.setTemperatura(temperatura);
        return this;
    }

    public BebidaBuilder setCalorias(int calorias) {
        bebida.setCalorias(calorias);
        return this;
    }

    public BebidaBuilder setDescricao(String descricao) {
        bebida.setDescricao(descricao);
        return this;
    }

    public BebidaBuilder setContemCafeina(boolean contemCafeina) {
        bebida.setContemCafeina(contemCafeina);
        return this;
    }

    public BebidaBuilder setContemAcucar(boolean contemAcucar) {
        bebida.setContemAcucar(contemAcucar);
        return this;
    }

    public BebidaBuilder setContemLeite(boolean contemLeite) {
        bebida.setContemLeite(contemLeite);
        return this;
    }

    public BebidaBuilder setContemChantilly(boolean contemChantilly) {
        bebida.setContemChantilly(contemChantilly);
        return this;
    }
}
