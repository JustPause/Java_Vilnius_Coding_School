package Telefonas.vcs.lt;

import java.math.BigDecimal;

public class Textefonas extends Telefonas {

    private BigDecimal pingu_likutis;
    private final BigDecimal SKAMBUCIO_KAINA = new BigDecimal(0.25);

    public BigDecimal getPinguLikutis() {
        return pingu_likutis;
    }

    public void papildytiPinguLikutis(BigDecimal duotiPinigai) {
        this.pingu_likutis = this.pingu_likutis.add(duotiPinigai);
    }

    public Textefonas(BigDecimal pinigai) {
        super("defalt nr");
        this.pingu_likutis = pinigai;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void paskambink(String tlfNr) {

    }

}
