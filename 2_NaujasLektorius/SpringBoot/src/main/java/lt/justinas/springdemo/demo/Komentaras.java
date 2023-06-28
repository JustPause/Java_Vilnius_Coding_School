package lt.justinas.springdemo.demo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "skaiciai")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Komentaras {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "tekstas")
	private String tekstas;

	@ManyToOne
	@JoinColumn(name = "skaiciusID",nullable = false)
	private Skaiciai skaicius;

	public Komentaras(String tekstas) {
		this.tekstas = tekstas;
	}
}
