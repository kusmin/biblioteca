package biblioteca

class Autor {
    String nome

    String toString(){
        this.nome
    }
    static constraints = {
        nome nullable:false, blank:false, unique:true, maxSize:128
    }
}
