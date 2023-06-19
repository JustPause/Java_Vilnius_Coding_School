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

public class Skaiciai {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "pavadinimas")
	private Long pavadinimas;

	@Column(name = "skaicus")
	private Long skaicus;

	@Column(name = "valiuta")
	private Long valiuta;

	public Skaiciai(Long pavadinimas, Long skaicus, Long valiuta) {
		this.pavadinimas = pavadinimas;
		this.skaicus = skaicus;
		this.valiuta = valiuta;
	}

}