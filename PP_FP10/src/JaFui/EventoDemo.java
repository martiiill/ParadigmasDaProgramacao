/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JaFui;

import Enumerations.Language;
import Exceptions.CoordinatesNotFound;
import Roulote.Bebida;
import Roulote.RotaEventos;
import Roulote.Sandwich;
import Roulote.Subscricao;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Ana Martins P.Porto @ESTG
 */
public class EventoDemo {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws Exceptions.CoordinatesNotFound
     */
    public static void main(String[] args) throws IOException, CoordinatesNotFound {
        Calendar dataInicioFestivalMusica = new GregorianCalendar(2016, 5, 2);
        Calendar dataFimFestivalMusica = new GregorianCalendar(2016, 5, 7);

        FestivalMusica f = new FestivalMusica(200, 100, "Festival De Negrelos City", "Festival super ri-fixe numa freguesia que NÃO pertence a Santo Tirso", "Porto", "Santo Tirso", dataInicioFestivalMusica, dataFimFestivalMusica, Language.PT, 15.50f);

        System.out.println("### Festival de Musica ####");
        System.out.println("Nome: " + f.getNome());
        System.out.println("Descricao: " + f.getDescricao());
        System.out.println("Distrito: " + f.getDistrito());
        System.out.println("Concelho: " + f.getConcelho());
        System.out.println("Coordenadas: " + f.getLocal());
        System.out.println("Data Inicio: " + f.getDataInicio());
        System.out.println("Data Fim: " + f.getDataFim());
        System.out.println("Tamanho Recinto: " + f.getTamanhoRecinto() + " m3");
        System.out.println("Capacidade máxima: " + f.getCapacidade() + " pessoas");
        System.out.println("Preço: " + f.getPrecoPessoa() + " euros por pessoa");
        System.out.println("Orçamento: " + f.calcularOrcamento() + " euros");

        Calendar dataInicioFeira = new GregorianCalendar(2017, 1, 20);
        Calendar dataFimFeira = new GregorianCalendar(2017, 1, 31);

        FeiraGastronomica feira = new FeiraGastronomica(20, "Feira de Chocolate e Gomas", "Festival de gomas e chocolates nunca antes vistos e saboreados em Portugal", "Guimarães", "Nespereira", dataInicioFeira, dataFimFeira, Language.PT, 25.50f);

        System.out.println("\n\n### Feira Gastronómica ####");
        System.out.println("Nome: " + feira.getNome());
        System.out.println("Descricao: " + feira.getDescricao());
        System.out.println("Distrito: " + feira.getDistrito());
        System.out.println("Concelho: " + feira.getConcelho());
        System.out.println("Coordenadas: " + feira.getLocal());
        System.out.println("Data Inicio: " + feira.getDataInicio());
        System.out.println("Data Fim: " + feira.getDataFim());
        System.out.println("Numero de Restaurantes participantes: " + feira.getNumeroRestaurantes());
        System.out.println("Preço: " + feira.getPrecoPessoa() + " euros por pessoa");
        System.out.println("Orçamento: " + feira.calcularOrcamento() + " euros");

        Calendar dataInicioExposicao = new GregorianCalendar(2017, 2, 10);
        Calendar dataFimExposicao = new GregorianCalendar(2017, 2, 26);
        String[] artistas = {"Juan Miró", "Ana Martins", "Boss", "Meguii", "Monet"};

        ExposicaoArte exp = new ExposicaoArte(artistas, "Exposição de Arte de Juan Miró", "Obras abstratas do artista icónico Juan Miró", "Porto", "Trofa", dataInicioExposicao, dataFimExposicao, Language.PT, 29.90f);

        System.out.println("\n\n### Exposição de Arte ####");
        System.out.println("Nome " + exp.getNome());
        System.out.println("Descricao: " + exp.getDescricao());
        System.out.println("Distrito: " + exp.getDistrito());
        System.out.println("Concelho: " + exp.getConcelho());
        System.out.println("Coordenadas: " + exp.getLocal());
        System.out.println("Data Inicio: " + exp.getDataInicio());
        System.out.println("Data Fim: " + exp.getDataFim());
        System.out.println(":: Artistas");
        System.out.println("Nomes: " + Arrays.toString(exp.getArtistas()));
        System.out.println("Preço: " + exp.getPrecoPessoa() + " euros por pessoa");
        System.out.println("Orçamento: " + exp.calcularOrcamento() + " euros");

        Bebida b = new Bebida(12.5f, 20, "Bebida Super-Alcoolica", 15.50f);

        System.out.println("\n\n### Bebidas ###");
        System.out.println("Nome: " + b.getNome());
        System.out.println("Tamanho: " + b.getTamanho());
        System.out.println("Volume de alcool: " + b.getPercentagemAlcool() + " %");
        System.out.println("Preço: " + b.getPreco() + " euros");
       // b.getPrecoProduto(b);
        
        Sandwich s = new Sandwich(3, "Mc Sandwich", 6.70f);

        System.out.println("\n\n### Sandwich ###");
        System.out.println("Nome: " + s.getNome());
        System.out.println("Numero de Ingredientes: " + s.getNumIngredientes());
        System.out.println("Preço: " + s.getPreco() + " euros");

        RotaEventos r = new RotaEventos();
        r.addObject(feira);
        r.addObject(exp);
        r.addObject(f);     
        
        for(int i = 0; i < r.getNumEventos(); i++){
            System.out.println("Nome: " + r.getEventos()[i].getNome());
        }
        System.out.println("Numero de eventos registados: " + r.getNumberOfObjects());
        
        Subscricao sb = new Subscricao();
        sb.AddSubscricao(sb);
        sb.AddSubscricao(sb);
        sb.AddSubscricao(sb);
        
        System.out.println("Numero de subscricoes: " + sb.getTotalSubscricoes());
        System.out.println("Total Tráfego: " + sb.getTotalTrafego() + " mb");       
    }
}
