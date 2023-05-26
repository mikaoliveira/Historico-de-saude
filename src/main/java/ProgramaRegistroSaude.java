
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaRegistroSaude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Crianca> criancas = new ArrayList<>();

        System.out.println("----- REGISTRO DE SAÚDE -----");

        // Menu principal
        int opcao = 0;
        while (opcao != 3) {
            exibirMenuPrincipal();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    registrarCrianca(scanner, criancas);
                    break;
                case 2:
                    entrarPerfilCrianca(scanner, criancas);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\n----- MENU PRINCIPAL -----");
        System.out.println("1. Registrar Criança");
        System.out.println("2. Entrar em Perfil de Criança");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void registrarCrianca(Scanner scanner, List<Crianca> criancas) {
        System.out.println("\n----- REGISTRAR CRIANÇA -----");
        System.out.print("Digite o nome da criança: ");
        String nomeCrianca = scanner.nextLine();

        Crianca crianca = new Crianca(nomeCrianca);
        criancas.add(crianca);

        System.out.println("Criança registrada com sucesso!");
    }

    private static void entrarPerfilCrianca(Scanner scanner, List<Crianca> criancas) {
        System.out.println("\n----- PERFIS DE CRIANÇAS REGISTRADAS -----");

        if (criancas.isEmpty()) {
            System.out.println("Nenhuma criança registrada.");
        } else {
            int opcao = 0;
            while (opcao != criancas.size() + 1) {
                exibirCriancasRegistradas(criancas);
                System.out.println(criancas.size() + 1 + ". Voltar");
                System.out.print("Digite o número da criança para acessar o perfil: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                if (opcao >= 1 && opcao <= criancas.size()) {
                    Crianca crianca = criancas.get(opcao - 1);
                    exibirMenuPerfilCrianca(scanner, crianca);
                } else if (opcao == criancas.size() + 1) {
                    System.out.println("Voltando para o menu principal...");
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }

    private static void exibirCriancasRegistradas(List<Crianca> criancas) {
        System.out.println("\n--- CRIANÇAS REGISTRADAS ---");
        int index = 1;
        for (Crianca crianca : criancas) {
            System.out.println(index + ". " + crianca.getNome());
            index++;
        }
    }

    private static void exibirMenuPerfilCrianca(Scanner scanner, Crianca crianca) {
        System.out.println("\n----- PERFIL DE " + crianca.getNome().toUpperCase() + " -----");

        int opcao = 0;
        while (opcao != 8) {
            exibirMenuOpcoesPerfil();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    registrarDoenca(scanner, crianca);
                    break;
                case 2:
                    registrarMedicacao(scanner, crianca);
                    break;
                case 3:
                    registrarDenticao(scanner, crianca);
                    break;
                case 4:
                    registrarConsultaMedica(scanner, crianca);
                    break;
                case 5:
                    registrarAlergia(scanner, crianca);
                    break;
                case 6:
                    registrarOutraOcorrencia(scanner, crianca);
                    break;
                case 7:
                    consultarRegistros(crianca);
                    break;
                case 8:
                    System.out.println("Voltando para o menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenuOpcoesPerfil() {
        System.out.println("\n----- MENU PERFIL -----");
        System.out.println("1. Registrar Doença");
        System.out.println("2. Registrar Medicação");
        System.out.println("3. Registrar Dentição");
        System.out.println("4. Registrar Consulta Médica");
        System.out.println("5. Registrar Alergia");
        System.out.println("6. Registrar Outra Ocorrência de Saúde");
        System.out.println("7. Consultar Registros");
        System.out.println("8. Voltar");
        System.out.print("Escolha uma opção: ");
    }

    private static void registrarDoenca(Scanner scanner, Crianca crianca) {
        System.out.println("\n----- REGISTRAR DOENÇA -----");
        System.out.print("Nome da doença: ");
        String nomeDoenca = scanner.nextLine();
        System.out.print("Sintomas (separados por vírgula): ");
        String sintomasInput = scanner.nextLine();
        List<String> sintomas = List.of(sintomasInput.split(","));
        System.out.print("Data do diagnóstico: ");
        String dataDiagnostico = scanner.nextLine();

        Doenca doenca = new Doenca(nomeDoenca, sintomas, dataDiagnostico);
        crianca.getProntuario().adicionarDoenca(doenca);

        System.out.println("Doença registrada com sucesso!");
    }

    private static void registrarMedicacao(Scanner scanner, Crianca crianca) {
        System.out.println("\n----- REGISTRAR MEDICAÇÃO -----");
        System.out.print("Nome da medicação: ");
        String nomeMedicacao = scanner.nextLine();
        System.out.print("Dosagem: ");
        String dosagem = scanner.nextLine();
        System.out.print("Data da prescrição: ");
        String dataPrescricao = scanner.nextLine();

        Medicacao medicacao = new Medicacao(nomeMedicacao, dosagem, dataPrescricao);
        crianca.getProntuario().adicionarMedicacao(medicacao);

        System.out.println("Medicação registrada com sucesso!");
    }

    private static void registrarDenticao(Scanner scanner, Crianca crianca) {
        System.out.println("\n----- REGISTRAR DENTIÇÃO -----");
        System.out.print("Nome do dente: ");
        String nomeDente = scanner.nextLine();
        System.out.print("Data do aparecimento: ");
        String dataAparecimento = scanner.nextLine();

        Denticao denticao = new Denticao(nomeDente, dataAparecimento);
        crianca.getProntuario().adicionarDenticao(denticao);

        System.out.println("Dentição registrada com sucesso!");
    }

    private static void registrarConsultaMedica(Scanner scanner, Crianca crianca) {
        System.out.println("\n----- REGISTRAR CONSULTA MÉDICA -----");
        System.out.print("Nome do médico: ");
        String nomeMedico = scanner.nextLine();
        System.out.print("Data da consulta: ");
        String dataConsulta = scanner.nextLine();
        System.out.print("Diagnóstico: ");
        String diagnostico = scanner.nextLine();

        ConsultaMedica consulta = new ConsultaMedica(nomeMedico, dataConsulta, diagnostico);
        crianca.getProntuario().adicionarConsultaMedica(consulta);

        System.out.println("Consulta médica registrada com sucesso!");
    }

    private static void registrarAlergia(Scanner scanner, Crianca crianca) {
        System.out.println("\n----- REGISTRAR ALERGIA -----");
        System.out.print("Alergeno: ");
        String alergeno = scanner.nextLine();
        System.out.print("Gravidade: ");
        String gravidade = scanner.nextLine();

        Alergia alergia = new Alergia(alergeno, gravidade);
        crianca.getProntuario().adicionarAlergia(alergia);

        System.out.println("Alergia registrada com sucesso!");
    }

    private static void registrarOutraOcorrencia(Scanner scanner, Crianca crianca) {
        System.out.println("\n----- REGISTRAR OUTRA OCORRÊNCIA DE SAÚDE -----");
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Data da ocorrência: ");
        String dataOcorrencia = scanner.nextLine();

        OutraOcorrencia ocorrencia = new OutraOcorrencia(descricao, dataOcorrencia);
        crianca.getProntuario().adicionarOutraOcorrencia(ocorrencia);

        System.out.println("Outra ocorrência registrada com sucesso!");
    }

    private static void consultarRegistros(Crianca crianca) {
        System.out.println("\n----- CONSULTAR REGISTROS DE " + crianca.getNome().toUpperCase() + " -----");

        Prontuario prontuario = crianca.getProntuario();

        System.out.println("\n--- DOENÇAS ---");
        for (Doenca doenca : prontuario.getDoencas()) {
            System.out.println("Nome: " + doenca.getNome());
            System.out.println("Sintomas: " + String.join(", ", doenca.getSintomas()));
            System.out.println("Data do diagnóstico: " + doenca.getDataDiagnostico());
            System.out.println();
        }

        System.out.println("--- MEDICAÇÕES ---");
        for (Medicacao medicacao : prontuario.getMedicacoes()) {
            System.out.println("Nome: " + medicacao.getNome());
            System.out.println("Dosagem: " + medicacao.getDosagem());
            System.out.println("Data da prescrição: " + medicacao.getDataPrescricao());
            System.out.println();
        }

        System.out.println("--- DENTIÇÕES ---");
        for (Denticao denticao : prontuario.getDenticoes()) {
            System.out.println("Nome do dente: " + denticao.getNomeDente());
            System.out.println("Data do aparecimento: " + denticao.getDataAparecimento());
            System.out.println();
        }

        System.out.println("--- CONSULTAS MÉDICAS ---");
        for (ConsultaMedica consulta : prontuario.getConsultas()) {
            System.out.println("Nome do médico: " + consulta.getNomeMedico());
            System.out.println("Data da consulta: " + consulta.getDataConsulta());
            System.out.println("Diagnóstico: " + consulta.getDiagnostico());
            System.out.println();
        }

        System.out.println("--- ALERGIAS ---");
        for (Alergia alergia : prontuario.getAlergias()) {
            System.out.println("Alergeno: " + alergia.getAlergeno());
            System.out.println("Gravidade: " + alergia.getGravidade());
            System.out.println();
        }

        System.out.println("--- OUTRAS OCORRÊNCIAS ---");
        for (OutraOcorrencia ocorrencia : prontuario.getOutrasOcorrencias()) {
            System.out.println("Descrição: " + ocorrencia.getDescricao());
            System.out.println("Data da ocorrência: " + ocorrencia.getDataOcorrencia());
            System.out.println();
        }
    }
}