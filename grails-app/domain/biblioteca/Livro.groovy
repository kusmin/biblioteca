package biblioteca

class Livro {
    String titulo
    String edicao

    static belongsTo = [
        assunto:Assunto,
        autor:Autor
    ]

    static constraints = {
        titulo nullable:false, blank:false, maxSize:128, unique:['edicao']
        edicao nullable:true, blank:true, maxSize:32
    }
}