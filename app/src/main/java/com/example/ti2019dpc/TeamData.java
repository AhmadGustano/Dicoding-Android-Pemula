package com.example.ti2019dpc;

import java.util.ArrayList;

public class TeamData {
public static String[][] data = new String[][]{
        {"Team Secret","Team Secret selalu dikenal sebagai tim Dota 2 yang gemar merombak roster mereka setiap tahun. Dikomandoi oleh kapten legendaris, Clement \"Puppey\" Ivanov, tim ini berniat menjadi salah satu organisasi independen saat pertama kali dibentuk. Tujuannya agar setiap pemain mendapatkan gaji dan pembagian hadiah turnamen yang lebih besar." +
                "Setelah mendapatkan hasil kurang memuaskan di The International 2018 lalu, Puppey memecat Carry mereka, Ace, lalu menggantinya dengan talenta muda asal Polandia, Michal \"Nisha\" Jankowski." +
                "Tampil prima sejak awal musim, Puppey dan kawan-kawan tampil sebagai jawara di dua Major, Chongqing serta MDL Disneyland Paris. Meski pulang sangat awal pada gelaran Epicenter Major lalu, Team Secret berhasil tampil memukau di empat Major sebelumnya. Mereka berhasil menduduki klasemen DPC 2019 dan bakal jadi kandidiat yang diunggulkan di The International 2019 nanti."
                ,"https://image.redbull.com/rbcom/010/2015-04-22/1331718471175_2/0010/1/800/533/1/team-secret-s-new-logo.jpg"},
        {"Virtus Pro","Tim asal Rusia ini juga difavoritkan menjadi juara TI9.Skuat unggulan asal Rusia ini berhasil jadi runner-up di klasemen Dota Pro Circuit musim 2019. Seperti musim sebelumnya, VP tampil garang di setiap gelaran Major dan mampu tampil di partai final tiga kali pada musim 2018/2019. Seakan ingin mengembalikan kejayaan mereka, " +
                "VP tampil prima di Kuala Lumpur Major dan menjuarai Major pertama DPC 2018/2019, November lalu. ","https://www.darkspawngaming.com/wp-content/uploads/2018/12/virtus_pro_logo_840jpg-808x454.jpg"},
        {"Vici Gaming","Dibentuk pada tahun 2012, Vici Gaming merupakan tim dari Tiongkok yang berhasil lolos The International melalui undangan. Beranggotakan campuran antara pemain berpengalaman dan benih-benih bakat, Vici Gaming merupakan salah satu tim kuat serta merupakan saingan PSG.LGD dari tanah serumpun." +
                "Secara mengejutkan, roster baru Vici Gaming yang dipimpin oleh rOtK sebagai pelatih ini mampu menjuarai Dreamleague dan Epicenter Major. Vici menjadi tim asal Tiongkok paling bersinar di gelaran Dota Pro Circuit kali ini." +
                "","https://ih1.redbubble.net/image.343771199.5954/flat,1000x1000,075,f.u1.jpg"},
        {"Evil Geniuses","Sang jawara The International 2015, Evil Geniuses harus puas bersandar di posisi empat besar Dota Pro Circuit. Tiga kali tampil sebagai juara tiga di Kuala Lumpur, Chongqing, dan MDL Disneyland Paris Major, Arteezy dan kawan-kawan belum mampu tampil sebagai pemangku juara pertama. " +
                "Kini Evil Geniuses harus membuktikan kapasitas terbaik mereka jika ingin menjuarai The International untuk kedua kalinya di TI 9.","https://i.pinimg.com/originals/60/e7/20/60e720a5b2e8b304e804496435f53d8e.jpg"},
        {"Team Liquid","Sempat terjegal di awal musim, Team Liquid merombak roster mereka jelang Epicenter Major kemarin. Tanpa disangka w33 berhasil mengantar tim Kuda Biru untuk menjadi finalis di Major terakhir. Sempat terancam tidak mendapatkan direct invite, " +
                "Team Liquid berhasil menyalip para tim besar dan mampu finish di lima besar Dota Pro Circuit 2018/2019.","https://www.teamliquid.com/lcs/images/wallpaper/TL_3DLogo_White_on_DarkBlue_Logo_Desktop.jpg"},
        {"PSG.LGD","Runner-up The International 2018, PSG.LGD harus merasakan sengitnya kompetisi Dota Pro Circuit kali ini. Beruntung Ame dan kawan-kawan masih bisa tampil prima di beberapa kesempatan dan memastikan posisi mereka di DPC kali ini. " +
                "Sisa waktu hingga bulan Agustus mendatang bisa jadi kesempatan yang baik untuk PSG.LGD melatih permainan mereka untuk jadi yang terbaik di The International 2018/2019.","https://y4j7y8s9.ssl.hwcdn.net/wp-content/uploads/2019/01/psg-lgd-HLA-Jeans.jpg"},
        {"Fnatic","Fnatic mengukuhkan posisi mereka sebagai tim terbaik Asia Tenggara di Dota Pro Circuit 2018/2019. Sempat menantang Vici Gaming di final DreamLeague Major, " +
                "Abed dan kawan-kawan berhasil tampil meyakinkan untuk mengamankan undangan mereka ke The International 2019.Apakah Fnatic  menjadi tim asal Asia Tenggara pertama yang jadi pemangku Aegis of the Champions jika mereka memenangkan TI 2019","https://i.pinimg.com/originals/e2/46/1f/e2461f6934b97190b0ac239e6ce6b807.png"},
        {"Ninjas in Pyjamas","Kembalinya kapten legendaris PPD ke skena esports Dota 2 berbuah manis. Kini mantan kapten dari Evil Geniuses ini bakal memimpin NiP untuk hadir di gelaran The International 2019. " +
                "Sepak terjang NiP di DPC kali ini penuh perjuangan. Berkali-kali PPD dan kawan-kawan harus memulai gelaran dengan hadir di Minor lebih dulu. " +
                "Mereka menjadi pemenang di dua Minor terakhir, DotaPit dan Starladder Minor Season 2.","https://i.pinimg.com/originals/c7/3d/bc/c73dbcd70e0b78cc9fe92925289b7963.jpg"},
        {"TNC Predator","Selain Fnatic, TNC jadi tim kedua asal Asia Tenggara yang berhasil mendapatkan undangan langsung ke The International 2019. Meski baru bersinar di Major terakhir, Kuku dan kawan-kawan membuktikan tekad mereka untuk kembalit tampil di The International kali ini. " +
                "Masuknya TNC membuktikan kalau region Asia Tenggara masih memiliki banyak talenta berbakat.","https://pbs.twimg.com/profile_images/1152172664640770048/pT3L5OR3_400x400.jpg"},
        {"OG","Sang jawara The International 2018 lalu harus tampil berdarah-darah untuk bisa tampil di The International 2019. Memulai awal musim dengan libur dari skena kompetitif membuat OG kesulitan melakukan follow up. Diikuti dengan kembalinya Ana, OG tampil cukup menantang di dua Major terakhir." +
                " Kini mereka tinggal membesarkan harapan penggemar untuk jadi juara back to back The International pertama kali.","https://www.revivaltv.id/wp-content/uploads/2016/09/OG.jpg"},
        {"Alliance","Skuat anyar Alliance mampu jadi tim keempat asal Eropa yang tampil ke The International 2019. Formasi yang bertahan hampir 2 tahun tersebut mulai menunjukkan taringnya di Dota Pro Circuit kali ini. " +
                "Skuad yang dipimpin langsung oleh sang kapten legendaris LodA sebagai pelatih ini masih punya kesempatan meraih Aegis of the Champions kedua mereka di The International 2019 nanti.","https://dotawallpaper.org/wp-content/uploads/2016/08/Team%20Alliance%20Logo%20Dota%202-620x349.jpg"},
        {"Keen Gaming ","Absennya banyak tim besar Tiongkok di Dota Pro Circuit seakan menandakan regenerasi talenta Dota 2 di negeri Tirai Bambu tersebut. Keen Gaming jadi salah satu tim yang beruntung bisa memastikan slot terakhir Dota Pro Circuit setelah tampil di DreamLeague dan MDL Disneyland Major." +
                "Hasil kurang memuaskan tersebut sangatlah berbanding terbalik dengan roster yang dimiliki oleh Keen Gaming di mana saat ini Keen Gaming diperkuat oleh 3 pemain veteran Tiongkok." +
                "Ketiga pemain tersebut adalah old chicken, eLeVeN dan Kaka. Keen Gaming meminjam jasa old chicken dan eLeVeN dari EHOME dan Kaka baru saja menyelesaikan periode panjang dan sukses di Newbee." +
                "Dua anggota terakhir tim, pemain tengah mereka 一 (atau Yi) dan kapten tim, dark, telah berada di dalam ekosistem EHOME / Keen Gaming di sepanjang karir mereka.","https://cdn0.gamesports.net/content_teasers_social/59000/59515.jpg?1505992467"}
};
    public static ArrayList<Team> getListData(){
        ArrayList<Team> list = new ArrayList<>();
        for (String[] aData : data) {
            Team team = new Team();
            team.setName(aData[0]);
            team.setDescription(aData[1]);
            team.setLogo(aData[2]);
            list.add(team);
        }
        return list;
    }
}
