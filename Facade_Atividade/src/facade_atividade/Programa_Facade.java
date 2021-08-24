
package facade_atividade;


public class Programa_Facade {
      protected Pagamentos _pagamentos;
    protected Hotel_Reserva _reserva_hotel;
    protected Passagem_Reserva _reserva_passagem;
    protected Carro_Aluguel _aluguel_carro;
   
    public void subsistema(){
        _reserva_passagem = new Passagem_Reserva();
        _reserva_passagem.opção001();
        _reserva_passagem.opção002();
        //____________________
        _pagamentos = new Pagamentos();
        _pagamentos.opção1();
        _pagamentos.opção2();
        //____________________
        _reserva_hotel = new Hotel_Reserva();
        _reserva_hotel.opção01();
        _reserva_hotel.opção02();
        //_____________________
        
        _aluguel_carro = new Carro_Aluguel();
        _aluguel_carro.opção0001();
        _aluguel_carro.opção0002();
        
       
    }
     public void pass(String tipo){
            _reserva_passagem.opção003(tipo);
        }
     public void hot(String tipo){
            _reserva_hotel.opção03(tipo);
        }
     public void pag(String tipo){
            _pagamentos.opção3(tipo);
        }
}
