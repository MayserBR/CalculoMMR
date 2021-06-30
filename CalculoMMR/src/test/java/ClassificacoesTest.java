import junit.framework.TestCase;
import org.junit.Test;

import static org.easymock.EasyMock.*;

public class ClassificacoesTest extends TestCase {

    protected void setUp() throws Exception{
        super.setUp();
    }

//TESTES UNITARIOS

// Classificacoes classificacoes;

// public void testClassificacoes_Ferro(){
//     classificacoes.setValorMmr(10);
//     assertEquals("Classificação Ranqueada Ferro", classificacoes.classific());
// }

// public void testClassificacoes_Bronze(){
//     classificacoes.setValorMmr(20);
//     assertEquals("Classificação Ranqueada Bronze", classificacoes.classific());
// }

// public void testClassificacoes_Prata(){
//     classificacoes.setValorMmr(30);
//     assertEquals("Classificação Ranqueada Prata", classificacoes.classific());
// }

// public void testClassificacoes_Ouro(){
//     classificacoes.setValorMmr(40);
//     assertEquals("Classificação Ranqueada Ouro", classificacoes.classific());
// }

// public void testClassificacoes_Platina(){
//     classificacoes.setValorMmr(50);
//     assertEquals("Classificação Ranqueada Platina", classificacoes.classific());
// }

// public void testClassificacoes_Diamante(){
//     classificacoes.setValorMmr(60);
//     assertEquals("Classificação Ranqueada Diamante", classificacoes.classific());
// }

// public void testClassificacoes_Mestre(){
//     classificacoes.setValorMmr(70);
//     assertEquals("Classificação Ranqueada Mestre", classificacoes.classific());
// }

// public void testClassificacoes_GraoMestre(){
//     classificacoes.setValorMmr(80);
//     assertEquals("Classificação Ranqueada GraoMestre", classificacoes.classific());
// }

// public void testClassificacoes_Desafiante(){
//     classificacoes.setValorMmr(90);
//     assertEquals("Classificação Ranqueada Desafiante", classificacoes.classific());
// }

// public void testClassificacoes_Global(){
//     classificacoes.setValorMmr(100);
//     assertEquals("Classificação Ranqueada Global", classificacoes.classific());
// }

    //TESTES DE MOCK

    @Test
    public void testeFerro(){
        InterfaceMMR auxmock = createMock(InterfaceMMR.class);
        expect(auxmock.getTotalVitorias()).andReturn(05);        //5 Partidas Representa 10%
        replay(auxmock);

        Classificacoes classificacoes = new Classificacoes();
        assertEquals("Classificação Ranqueada Ferro", classificacoes.classific(auxmock));
    }
    @Test
    public void testeBronze(){
        InterfaceMMR auxmock = createMock(InterfaceMMR.class);
        expect(auxmock.getTotalVitorias()).andReturn(10);       //10 Partidas Representa 20%
        replay(auxmock);

        Classificacoes classificacoes = new Classificacoes();
        assertEquals("Classificação Ranqueada Bronze", classificacoes.classific(auxmock));
    }
    @Test
    public void testePrata(){
        InterfaceMMR auxmock = createMock(InterfaceMMR.class);
        expect(auxmock.getTotalVitorias()).andReturn(15);       //15 Partidas Representa 30%
        replay(auxmock);

        Classificacoes classificacoes = new Classificacoes();
        assertEquals("Classificação Ranqueada Prata", classificacoes.classific(auxmock));
    }
    @Test
    public void testeOuro(){
        InterfaceMMR auxmock = createMock(InterfaceMMR.class);
        expect(auxmock.getTotalVitorias()).andReturn(20);       //20 Partidas Representa 40%
        replay(auxmock);

        Classificacoes classificacoes = new Classificacoes();
        assertEquals("Classificação Ranqueada Ouro", classificacoes.classific(auxmock));
    }
    @Test
    public void testePlatina(){
        InterfaceMMR auxmock = createMock(InterfaceMMR.class);
        expect(auxmock.getTotalVitorias()).andReturn(25);       //25 Partidas Representa 50%
        replay(auxmock);

        Classificacoes classificacoes = new Classificacoes();
        assertEquals("Classificação Ranqueada Platina", classificacoes.classific(auxmock));
    }
    @Test
    public void testeDiamante(){
        InterfaceMMR auxmock = createMock(InterfaceMMR.class);
        expect(auxmock.getTotalVitorias()).andReturn(30);       //30 Partidas Representa 60%
        replay(auxmock);

        Classificacoes classificacoes = new Classificacoes();
        assertEquals("Classificação Ranqueada Diamante", classificacoes.classific(auxmock));
    }
    @Test
    public void testeMestre(){
        InterfaceMMR auxmock = createMock(InterfaceMMR.class);
        expect(auxmock.getTotalVitorias()).andReturn(35);       //35 Partidas Representa 70%
        replay(auxmock);

        Classificacoes classificacoes = new Classificacoes();
        assertEquals("Classificação Ranqueada Mestre", classificacoes.classific(auxmock));
    }
    @Test
    public void testeGraoMestre(){
        InterfaceMMR auxmock = createMock(InterfaceMMR.class);
        expect(auxmock.getTotalVitorias()).andReturn(40);       //40 Partidas Representa 80%
        replay(auxmock);

        Classificacoes classificacoes = new Classificacoes();
        assertEquals("Classificação Ranqueada Grão Mestre", classificacoes.classific(auxmock));
    }
    @Test
    public void testeDesafiante(){
        InterfaceMMR auxmock = createMock(InterfaceMMR.class);
        expect(auxmock.getTotalVitorias()).andReturn(45);        //45 Partidas Representa 90%
        replay(auxmock);

        Classificacoes classificacoes = new Classificacoes();
        assertEquals("Classificação Ranqueada Desafiante", classificacoes.classific(auxmock));
    }
    @Test
    public void testeGlobal(){
        InterfaceMMR auxmock = createMock(InterfaceMMR.class);
        expect(auxmock.getTotalVitorias()).andReturn(50);         //50 Partidas Representa 100%
        replay(auxmock);

        Classificacoes classificacoes = new Classificacoes();
        assertEquals("Classificação Ranqueada Global", classificacoes.classific(auxmock));
    }

}