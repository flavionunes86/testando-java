//Classe Account que contém uma variável de instancia name
//e métodos para configurar e obter seu valor


public class Account{
    private String name;  //variavel de instancia


    //metodo para definir o nome no objeto
    public void setName(String name)
    {
        this.name = name;  //armazena o nome
    }


     //metodo para recuperar o nome do objeto
    public String getName()
    {
        return name;       //retorna valor do nome parar o chamador
    }
} // fim da classe Account

   
  