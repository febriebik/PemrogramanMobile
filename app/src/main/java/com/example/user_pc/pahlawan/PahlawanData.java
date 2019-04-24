package com.example.user_pc.pahlawan;

import com.example.user_pc.pahlawan.Pahlawan;

import java.util.ArrayList;

public class PahlawanData {
    public static String[][] data = new String[][]{
            {"Soekarno", "Presiden Pertama Republik Indonesia", "https://upload.wikimedia.org/wikipedia/commons/0/01/Presiden_Sukarno.jpg", "Soekarno merupakan presiden pertama Indonesia yang juga dikenal sebagai arsitek alumni dari Technische Hoogeschool te Bandoeng (sekarang ITB) di Bandung dengan mengambil jurusan teknik sipil dan tamat pada tahun 1926."},
            {"Mohammad Hatta", "Wakil Presiden Pertama Republik Indonesia", "https://upload.wikimedia.org/wikipedia/commons/3/3b/VP_Hatta.jpg", "Dr. H. Mohammad Hatta lahir di Bukittinggi, 12 Agustus 1902. Pria yang akrab disapa dengan sebutan Bung Hatta ini merupakan pejuang kemerdekaan RI yang kerap disandingkan dengan Soekarno. Tak hanya sebagai pejuang kemerdekaan, Bung Hatta juga dikenal sebagai seorang organisatoris, aktivis partai politik, negarawan, proklamator, pelopor koperasi, dan seorang wakil presiden pertama di Indonesia."},
            {"Jendral Sudirman", "Panglima Tentara Pertama Republik Indonesia", "https://upload.wikimedia.org/wikipedia/commons/e/e7/Sudirman.jpg", "Jenderal Sudirman, dikenal sebagai salah satu pahlawan Indonesia panglima pertama tentara Republik Indonesia, jasa-jasanya sangat dikenang dalam memperjuangkan kemerdekaan Indonesia, Jenderal Besar Sudirman ini lahir di Bodas Karangjati, Rembang, Purbalingga, 24 Januari 1916.  "},
            {"Ki Hajar Dewantara", "Pelopor di Bidang Pendidikan", "https://upload.wikimedia.org/wikipedia/commons/3/3a/Ki_Hadjar_Dewantara_Mimbar_Umum_18_October_1949_p2.jpg", "Ki Hadjar Dewantara lahir di Yogyakarta pada tanggal 2 Mei 1889 dengan nama Raden Mas Soewardi Soeryaningrat. Ki Hajar Dewantara dibesarkan di lingkungan keluarga kraton Yogyakarta. Ki Hajar Dewantara dikenal sebagai Bapak Pendidikan karena beliau merupakan pendiri taman siswa pertama kali di Indonesia"},
            {"Raden Ajeng Kartini", "Pelopor Kebangkitan Perempuan", "https://upload.wikimedia.org/wikipedia/commons/2/23/COLLECTIE_TROPENMUSEUM_Portret_van_Raden_Ajeng_Kartini_TMnr_10018776.jpg", "R.A Kartini lahir pada tanggal 21 April tahun 1879 di Kota Jepara. Nama lengkap Kartini adalah Raden Ajeng Kartini Djojo Adhiningrat. Beliau merupakan tokoh pahlawan pelopor kebangkitan perempuan"},
            {"I Gusti Ngurah Rai", "Brigadir Jendral TNI", "https://upload.wikimedia.org/wikipedia/id/f/ff/Gusti_ngurah_rai.jpg", "Lahir di Badung, 30 Januari 1917, I Gusti Ngurah Rai merupakan anak dari seorang camat Petang, I Gusti Ngurah Palung.Tertarik dengan dunia militer sejak kecil, Ngurah Rai bergabung dengan HIS Denpasar lalu melanjutkan dengan MULO yang ada di Malang. Tak cukup sampai di sana, ia kemudian bergabung dengan sekolah kader militer, Prayodha Bali, Gianyar. Pada tahun 1940, Ngurah Rai dilantik sebagai Letnan II yang kemudian melanjutkan pendidikan di Corps Opleiding Voor Reserve Officieren (CORO), Magelang dan Pendidikan Artileri, Malang."},
            {"Pangeran Diponegoro", "Pemimpin Perang Jawa", "https://upload.wikimedia.org/wikipedia/commons/2/2c/Diponegoro.jpg", "Bendara Pangeran Harya Dipanegara (lebih dikenal dengan nama Diponegoro, lahir di Ngayogyakarta Hadiningrat, 11 November 1785 – meninggal di Makassar, Hindia Belanda, 8 Januari 1855 pada umur 69 tahun) adalah salah seorang pahlawan nasional Republik Indonesia. Pangeran Diponegoro terkenal karena memimpin Perang Diponegoro/Perang Jawa (1825-1830) melawan pemerintah Hindia Belanda. Perang tersebut tercatat sebagai perang dengan korban paling besar dalam sejarah Indonesia."}
    };
    public static ArrayList<Pahlawan> getListData(){
        Pahlawan pahlawan = null;
        ArrayList<Pahlawan> list = new ArrayList<>();
        for (String[] aData : data) {
            pahlawan = new Pahlawan();
            pahlawan.setName(aData[0]);
            pahlawan.setRemarks(aData[1]);
            pahlawan.setPhoto(aData[2]);
            pahlawan.setDesc(aData[3]);

            list.add(pahlawan);
        }

        return list;
    }
}