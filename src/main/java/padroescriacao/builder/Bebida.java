package padroescriacao.builder;

public class Bebida {

    private String nome;
    private String tamanho;
    private double preco;
    private String tipo;
    private String temperatura;
    private int calorias;
    private String descricao;
    private boolean contemCafeina;
    private boolean contemAcucar;
    private boolean contemLeite;
    private boolean contemChantilly;

    public Bebida() {
        this.nome = "";
        this.tamanho = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isContemCafeina() {
        return contemCafeina;
    }

    public void setContemCafeina(boolean contemCafeina) {
        this.contemCafeina = contemCafeina;
    }

    public boolean isContemAcucar() {
        return contemAcucar;
    }

    public void setContemAcucar(boolean contemAcucar) {
        this.contemAcucar = contemAcucar;
    }

    public boolean isContemLeite() {
        return contemLeite;
    }

    public void setContemLeite(boolean contemLeite) {
        this.contemLeite = contemLeite;
    }

    public boolean isContemChantilly() {
        return contemChantilly;
    }

    public void setContemChantilly(boolean contemChantilly) {
        this.contemChantilly = contemChantilly;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "nome='" + nome + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", preco=" + preco +
                ", tipo='" + tipo + '\'' +
                ", temperatura='" + temperatura + '\'' +
                ", calorias=" + calorias +
                ", descricao='" + descricao + '\'' +
                ", contemCafeina=" + contemCafeina +
                ", contemAcucar=" + contemAcucar +
                ", contemLeite=" + contemLeite +
                ", contemChantilly=" + contemChantilly +
                '}';
    }
}
