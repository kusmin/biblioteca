package biblioteca

class Autor {
    String nome

    static constraints = {
        nome nullable:false, blank:false, unique:true, maxSize:128
    }
}
