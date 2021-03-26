package biblioteca

class Assunto {
    String nome

    static belongsTo = [pai:Assunto]

    static constraints = {
        nome nullable:false, blank:false, maxSize:128, unique:['pai']
        pai nullable:true
    }
}
