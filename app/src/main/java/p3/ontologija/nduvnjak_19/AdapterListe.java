package p3.ontologija.nduvnjak_19;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class AdapterListe extends RecyclerView.Adapter<AdapterListe.Red> {

    private List<Glumac> podaci;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public AdapterListe(Context context) {
        this.mInflater = LayoutInflater.from(context);
        podaci = new ArrayList<>();
    }

    @Override
    public Red onCreateViewHolder(ViewGroup roditelj, int viewType) {
        View view = mInflater.inflate(R.layout.red_liste, roditelj, false);
        return new Red(view);
    }

    @Override
    public void onBindViewHolder(Red red, int position) {
        Glumac g = podaci.get(position);
        red.glumac.setText(g.getGlumac());
        red.nagrada.setText(g.getNagrada());
        red.rodjenje.setText(g.getRodjenje());;
        red.zavrsio.setText(g.getZavrsio());
        red.glumi.setText(g.getGlumi());
        red.godina.setText(String.valueOf(g.getGodina()));
        red.imaUloga.setText(String.valueOf(g.getImaUloga()));
    }

    @Override
    public int getItemCount() {
        return podaci==null ? 0 : podaci.size();
    }

    public class Red extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView glumac;
        private TextView nagrada;
        private TextView rodjenje;
        private TextView zavrsio;
        private TextView glumi;
        private TextView godina;
        private TextView imaUloga;

        Red(View itemView) {
            super(itemView);
            glumac = itemView.findViewById(R.id.glumac);
            nagrada = itemView.findViewById(R.id.nagrada2);
            zavrsio = itemView.findViewById(R.id.zavrsio2);
            rodjenje = itemView.findViewById(R.id.rodjenje2);
            glumi = itemView.findViewById(R.id.glumi);
            godina = itemView.findViewById(R.id.godina);
            imaUloga = itemView.findViewById(R.id.brojUloga2);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public Glumac getItem(int id) {
        return podaci.get(id);
    }

    public void setPodaci(List<Glumac> itemList) {
        this.podaci = itemList;
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
