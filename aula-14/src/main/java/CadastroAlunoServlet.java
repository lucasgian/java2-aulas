

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CadastroAlunoServlet
 */
public class CadastroAlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroAlunoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //Quando quero pegar uma informação que vem da url usamos o doGET
    //Quando tivermos uma chamada por url usamos GET
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");

		Aluno aluno = new Aluno(nome, Integer.parseInt(idade));
		request.setAttribute("nome", aluno.nome);
		RequestDispatcher view = request.getRequestDispatcher("novoAluno.jsp");
		view.forward(request, response);
	}

}
