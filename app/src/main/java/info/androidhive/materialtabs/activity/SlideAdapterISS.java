package info.androidhive.materialtabs.activity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import info.androidhive.materialtabs.R;

public class SlideAdapterISS extends PagerAdapter {
    Context context;
    LayoutInflater inflater;
    public String[] headings = {"Niyah (1 of 17)" ,"Takbeer (2 of 17)", "Qayyam (3 of 17)","Ruku (4 of 17)","Qauma (5 of 17)","First Sajdah (6 of 17)","Jalsa (7 of 17)","Second Sajdah (8 of 17)","Qayyam (9 of 17)","Ruku (10 of 17)","Qauma (11 of 17)","First Sajdah (12 of 17)","Jalsa (13 of 17)","Second Sajdah (14 of 17)","Tashshahud (15 of 17)","Salam (16 of 17)","Salam (17 of 17)"};
    public int[] images={R.drawable.a1, R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a6,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a9,};
    public String[] title={"After performing Wuzu, face towrds the Qibla and stand straight so that there is a gap of at least four fingers between your feet. Keep your eyes at the place of prostration. ","Raise your hands'palms facing towards Kaaba,up till your shoulders and leave the fingers in their normal state, don't join them together or spread them apart. \n Say 'اللَّهُ أَكْبَر \n Allah u Akbar' \n as your hands leave shoulder and fold your hands at your chest. " ,"Place the left hand on the chest and right hand on top of the left hand in a way that palm of your right hand is on the back of the palm of left hand and fingres are straight. \n Then recite thana:سُبْحَانَكَ اللّهُمَّ وَبِحَمْدِكَ، وَتَبَارَكَ اسْمُكَ، وَتَعَالَى جَدُّكَ، وَلاَ إلَهَ غَيْرُكَ  \n Subhaana kal-Laahumma Wa Bi-Hamdika Wa Tabaarakasmuka Wa Ta'ala Jadduka Walaa Illaaha Ghaie-Ruk","While bending, without raising arms and hands say: 'اللَّهُ أَكْبَر \n Allah u Akbar ","Rise up from ruku, leaving the hand hanging at the side and recite(while standing up): سَمِعَ اللَّهُ لِمَنْ حَمِدَهُ\n Samey - Allahu - Leman - Hameda","Whilst going down for sajdah, say:'اللَّهُ أَكْبَر \n Allah u Akbar' without raising your hands up. اللَّهُ أَكْبَر\n Allah u Akbar"," اللَّهُ أَكْبَر\n Allah u Akbar","Whilst going down for sajdah, say:' اللَّهُ أَكْبَر\n Allah u Akbar' without raising your hands up.\n اللَّهُ أَكْبَر \n Allah u Akbar","Rise from the sajdah. Do not stand up immediately from the sajdah, first make sitting posture and then place your hands on your knees and stand upright (don't put your hands on the ground to assist you to stand up). \n While rising up say:\n اللَّهُ أَكْبَر\n Allah u Akbar","While bending, without raising arms and hands say:\n اللَّهُ أَكْبَر \n Allah u Akbar ","Rise up from ruku, leaving the hand hanging at the side and recite(while standing up): \n سَمِعَ اللَّهُ لِمَنْ حَمِدَهُ\n Samey - Allahu - Leman - Hameda","Whilst going down for sajdah, say:'اللَّهُ أَكْبَر  \n Allah u Akbar' without raising your hands up. \n Allah u Akbar","Allahu Akbar","Whilst going down for sajdah, say:'Allah u Akbar' without raising your hands up. \n Allah u Akbar","Allahu Akbar \n 'Allah is the Greatest' \n Say ' Allahu Akbar' while rising up from 2nd sajdah of second raka'at. Sit properly in Jalsa posture described in Jalsa step and recite following:\n التَّحِيَّاتُ لِلَّهِ، وَالصَّلَوَاتُ، وَالطَّـيِّـبَاتُ، اَلسَّلاَمُ عَلَى النَّبِيِّ وَرَحْمَةُ اللَّهِ وَبَرَكَاتُهُ، اَلسَّلاَمُ عَلَيْنَا وَعَلَى عِبَادِ اللَّه ِالصَّالِحِيْنَ، أَشْهَدُ أَنْ لاَّ إلَهَ إلاَّ اللَّهُ، وَأَشْهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُهُ\n","After reciting dua, face towards the right direction,sight on the shoulder and say:","Then facing towards the left direction,sight on the shoulder and say:"};
    public String[] descriptions={"You do not need to say it loud, but you should know the type and number of rak'ats of the prayer you are going to offer.  \n An example would be to think like:","\n Allah u Akbar اللَّهُ أَكْبَر","'All glory is due to YOU,O' Allah! And all praise is due to YOU, and YOUR name is the most blessed, and YOUR majesty is highly exalted and there is none worth of worship except YOU'","","","","'Allah is The Greatest","","'Allah is The Greatest'\n Place the left hand on the chest and right hand on top of the left hand in a way that palm of your right hand is on the back of the palm of left hand and fingres are straight. \n Then recite tasmiyah: \n بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيْم\n Bis Millahir Remaanir Raheem \n 'In the name of Allah, the Most Kind and the Most Merciful'","'Allah is The Greatest'","'ALLAH listens to HIM'","","","","Atta-Hee-Yaatu Liiaahi Was-Salawatu Wat-Taie-Yi-Baatu As-Salamu Alaika Aie-Yu-HanNabeeyu Wa Rahmatul Laahi Wa Barakaatu As-Salaamu Alaienaa Wa Alaa Ibaadil Laahis-Saaleheen Aashhadu Alla Ilaaha Illal-Laahu Wa Ashhadu Annah Muhmmadan Abduhu Wa Rasulu. \n ' O Allah! Ypu Alone deserve all Veneration, Worship and Glory. O Prophet! Peace be on you and the Mercy of Allah and His Blessings.Peace be upon us and on righteous servants of Allah. I bear witness that one is worthy of worship except Allah and I bear witness that Muhammad is His servant and Messenger.'","اَلسَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللَّه","اَلسَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللَّه"};
    public String[] descriptionn={"'I have presented myself in front of Allah to offer 2 rak'at Sunnah of Isha prayer, for Allah, facing towards Kaaba'."," 'Allah is the Greatest","Then recite tawwuz: \n A' auodu Billaahi Minash-Syaytaanir Rajjem. \n  'I seek Allah's protection from Satan who is accursed'","'Allah is the Greatest'","'Allah listens to him who Praises Him'","'Allah is the Greatest","Remain seated in Jalsa posture for 2-3 seconds.","'Allah is the Greatest","Then recite tasmiyah: بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيْم\n Bis Millahir Remaanir Raheem \n 'In the name of Allah, the Most Kind and the Most Merciful'","","","'Allah is The Greatest'","'Allah is The Greatest'","'Allah is The Greatest'","At the time of the words Aashhadu, fold the little and ring finger(of the right hand)inwards and from a circle with the middle finger and thumb. Point the index finger towards Qibla by lifting up when saying 'La Ilaha' and should be lowered back when saying 'Ill Allah',then open the circle and keep your hand straight on thighs. \n OR","'Peace be upon you and the mercy of Allah.'","'Peace be upon you and the mercy of Allah.'"};
    public String[] des={"","Eyes should be focused at the place of prostration. It is recommended to raise hands under your viel.","Then recite tasmiyah: \nبِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيْم\n Bis-Millahhir Rahmaanir Raheem. \n 'In the name of Allah , the Most Kind and the Most Merciful'.","Bend your back only far enough to touch your knees with closed fingers, and not grasp them with the fingers spread wide open.You should truck your arms into the body by not spreading them outword.Looking from far it will look like a bow are(Do not flatten your back).Once you are bent to the proper angle,say(there or more odd times):","And then also say:","* First touch your kness to the ground followed by the hands.\n * Take out both legs towards the right hand side of the body more specifically draw out right leg towards the right side of the body and place the left leg bneath the right lwg and rest on the posterior(buttocks) without raising right foot or if you are unablr to sit in poster described above you can sit with feet position in a way that they are bended upside down touching the floor and rest on both feet./n * Put your hands with fingers pointed towards Qibla,at the side of the place where you are going to put Your head and keep your hands flat in such a way that the wrists are close to the shoulders and face is in between the palms. \n * Place your head by first placing your nose on the background and then your forehead.\n * Keep Your arms connected to the side of the body and cling(rest) them to the ground, also let your stomach touch your thighs. \n When you are positioned fully, say(three or more odd times); ","اللَّهُمَّ اغْفِرْ لِي، وَارْحَمْنِي، وَاجْبُرْنِي، وَارْفَعْنِي، وَعَافِنِي، وَارْزُقْنِي \n" + "\n Allahuma'ghfirlee Warham'nee Wahdee'nee Wa'afinee Warzuq'nee Wajbur'nee Warfaa'nee","Keep both legs towards the right hand side of the body more specifically draw out right leg towards the right side of the body and place the left leg bneath the right lwg and rest on the posterior(buttocks) without raising right foot or if you are unablr to sit in poster described above you can sit with feet position in a way that they are bended upside down touching the floor and rest on both feet./n * Put your hands with fingers pointed towards Qibla,at the side of the place where you are going to put Your head and keep your hands flat in such a way that the wrists are close to the shoulders and face is in between the palms. \\n * Place your head by first placing your nose on the background and then your forehead.\\n * Keep Your arms connected to the side of the body and cling(rest) them to the ground, also let your stomach touch your thighs. \\n When you are positioned fully, say(three or more odd times); ","Then recite tasmiyah: \n Bis-Millahhir Rahmaanir Raheem. \n 'In the name of Allah , the Most Kind and the Most Merciful'.","Bend your back only far enough to touch your knees with closed fingers, and not grasp them with the fingers spread wide open.You should truck your arms into the body by not spreading them outword.Looking from far it will look like a bow are(Do not flatten your back).Once you are bent to the proper angle,say(there or more odd times):","* First touch your kness to the ground followed by the hands.\n * Take out both legs towards the right hand side of the body more specifically draw out right leg towards the right side of the body and place the left leg bneath the right lwg and rest on the posterior(buttocks) without raising right foot or if you are unablr to sit in poster described above you can sit with feet position in a way that they are bended upside down touching the floor and rest on both feet./n * Put your hands with fingers pointed towards Qibla,at the side of the place where you are going to put Your head and keep your hands flat in such a way that the wrists are close to the shoulders and face is in between the palms. \n * Place your head by first placing your nose on the background and then your forehead.\n * Keep Your arms connected to the side of the body and cling(rest) them to the ground, also let your stomach touch your thighs. \n When you are positioned fully, say(three or more odd times); ","'ALLAH listens to him who Praises HIM'","اللَّهُمَّ اغْفِرْ لِي، وَارْحَمْنِي، وَاجْبُرْنِي، وَارْفَعْنِي، وَعَافِنِي، وَارْزُقْنِي\n" + "\n Allahuma'ghfirlee Warham'nee Wahdee'nee Wa'afinee Warzuq'nee Wajbur'nee Warfaa'nee","Keep both legs towards the right hand side of the body more specifically draw out right leg towards the right side of the body and place the left leg bneath the right lwg and rest on the posterior(buttocks) without raising right foot or if you are unablr to sit in poster described above you can sit with feet position in a way that they are bended upside down touching the floor and rest on both feet./n * Put your hands with fingers pointed towards Qibla,at the side of the place where you are going to put Your head and keep your hands flat in such a way that the wrists are close to the shoulders and face is in between the palms. \\n * Place your head by first placing your nose on the background and then your forehead.\\n * Keep Your arms connected to the side of the body and cling(rest) them to the ground, also let your stomach touch your thighs. \\n When you are positioned fully, say(three or more odd times); ","Point the index finger towards qibla by lifting up when saying'La Illaha' and should be lowered back when saying 'Ill Allah',without opening the circle and keeping fingers in folded form.\n Both options are correct either to open the circle or just drop the finger without opening the circle, so it can be performed in either ways.","   Assalamu Alikum Wa Rahmatullah","   Assalamu Alikum Wa Rahmatullah"};
    public String[] dess={"","","Then recite Surah Fatiha: الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ، الرَّحْمَٰنِ الرَّحِيمِ، مَالِكِ يَوْمِ الدِّينِ، إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ، اهْدِنَا الصِّرَاطَ الْمُسْتَقِيمَ، صِرَاطَ الَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ الْمَغْضُوبِ عَلَيْهِمْ وَلَا الضَّالِّينَ\n Al-Hamdu Lillaahi, Rabbil'aalameen, Arrahmaanir Raheem Maliki Yawmideen, Iyyaaka Na-Budo Wa-Iyyaaka Nasta'een, Ihdinassiraatalmustaqeem,Siraatalladheena An'amta Alayhim, Ghayril Maghdubi'alayhim, Waladduaaallen. \n 'All praise is for Allah, Lord of the worlds. The most Kind, the Most Merciful.The Master of the day of judgement. You alone we worship and to You alone we pray for help. Show us the straight path, the way of those whom You have favoured, and not of those who have deserved your anger  and gone astray.","\n سُبْحَانَ رَبِّيَ الْعَظِيْمِ \n Subhanna-Rabbeyal-Azeem","\n  رَبَّنَا لَکَ الْحَمْدِ \n Rabbana Lakal Hamd","\n  سُبْحَانَ رَبِّيَ الأَعْلَى \n Subhanna Rabbeyal Alla","","\n  سُبْحَانَ رَبِّيَ الأَعْلَى \n Subhanna Rabbeyal Alla","Then recite Surah Fatiha: \n الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ، الرَّحْمَٰنِ الرَّحِيمِ، مَالِكِ يَوْمِ الدِّينِ، إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ، اهْدِنَا الصِّرَاطَ الْمُسْتَقِيمَ، صِرَاطَ الَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ الْمَغْضُوبِ عَلَيْهِمْ وَلَا الضَّالِّينَ\nAl-Hamdu Lillaahi, Rabbil'aalameen, Arrahmaanir Raheem Maliki Yawmideen, Iyyaaka Na-Budo Wa-Iyyaaka Nasta'een, Ihdinassiraatalmustaqeem,Siraatalladheena An'amta Alayhim, Ghayril Maghdubi'alayhim, Waladduaaallen.","\n سُبْحَانَ رَبِّيَ الْعَظِيْمِ \n Subhanna-Rabbeyal-Azeem","\n  رَبَّنَا لَکَ الْحَمْدِ \n Rabbana Lakal Hamd","\n  سُبْحَانَ رَبِّيَ الأَعْلَى \n Subhanna Rabbeyal Alla","","\n  سُبْحَانَ رَبِّيَ الأَعْلَى \n Subhanna Rabbeyal Alla","After Tashahud,Durood Shareef must be recited in the last rak'at of the prayer: \n اللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ، وَعَلَى آلِ مُحَمَّدٍ، كَمَا صَلَّيْتَ عَلَى إبْرَاهِيْمَ وَعَلَى آلِ إبْرَاهِيْمَ، إنَّكَ حَمِيْدٌ مَجِيْدٌ، اَللَّهُمَّ بَارِكْ عَلَى مُحَمَّدٍ، وَعَلَى آلِ مُحَمَّدٍ، كَمَا بَارَكْتَ عَلَى إبْرَاهِيْمَ وَعَلَى آلِ إبْرَاهِيْمَ، إنَّكَ حَمِيْدٌ مَجِيْدٌ\n" + "\n Allaahumma Salli'Alaa Muhmmadin Wa'Alaa Ali Muhammadin Kamaa Sallaita'Alaa Ibraaheema Wa'Alaa Ali Ibraaheema Innka Hameedun Majeed Alahumma Baarik'Ala Muhmmadin Wa'Alaa Ali Muhmmadin Kamma Baarakta'Alaa Ibraaheema Wa'Alaa Ali Ibraaheema Innka Hameedun Majeed. \n 'O Allah ,let Your Peace come upon Muhammad and the family of Muhmmad, as You have brought Peace to Ibrahim and his family.Truly,You are Praiseworthy and Glorious.O Allah ,Bless Muhammad,as You Blessed Ibrahim and his family.Truly,You are Praiseworthy and Glorious.","",""};
    public String[] dea={"","","Then recite Surah Ikhlas: \n قُلْ هُوَ اللَّهُ أَحَدٌ اللَّهُ الصَّمَدُ لَمْ يَلِدْ وَلَمْ يُولَدْ وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ \n Qul Huwal-Lahu Ahad Alluhus-Samad Lam Yalid Wa Lam Yulad Wa Lam Yakul-Lahu Kuhwan Ahad. \n 'Say: He is Allah, the only one. Allah helps and does not need help. He does not produce a child and nor was He born of any one. There is none equal to him.'","Glorified is my Lord, the most great.","'O' our Sustainer! All Praise is due to You Alone.'","'Glorified is my Lord, the most high.'","'O Allah Forgive me. Have mercy on me, grant me wellbeing, guide me, grant me subsistence, repair my losses, and grant me a high position.'","'Glorified is my Lord, the most high.'","'All praise is for Allah, Lord of the worlds. The Most Kind, the Most Merciful. The Master of the Day of Judgement. You alone we worship and to You alone we pray for help. Show us the straight path, the way of those whom You have favoured, and not of those who have deserved Your anger and gone astray.'","Glorified is my Lord, the most great.","'O' our Sustainer! All Praise is due to You Alone.'","'Glorified is my Lord, the most high.'","'O Allah Forgive me. Have mercy on me, grant me wellbeing, guide me, grant me subsistence, repair my losses, and grant me a high position.'","'Glorified is my Lord, the most high.'","After Durrod,recite this dua: اللَّهُمَّ إِنِّي ظَلَمْتُ نَفْسِي ظُلْماً كَثِيراً، وَلَا يَغْفِرُ الذُّنُوبَ إِلَّا أَنْتَ، فَاغْفِرْ لِي مَغْفِرَةً مِنْ عِنْدِكَ وَارْحَمْنِي إِنَّكَ أَنْتَ الْغَفُورُ الرَّحِيمُ\n Allaahumma 'innee dhalamtu nafsee dhulman katheeran, wa laa yaghfiruth-thunooba 'illaa 'Anta, faghfir lee maghfiratan min 'indika warhamnee 'innaka 'Antal-Ghafoorur-Raheem","",""};
    public  SlideAdapterISS(Context context){
        this.context= context;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return (view==(RelativeLayout)o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        RelativeLayout layoutslide = (RelativeLayout) view.findViewById(R.id.sliderelativelayout);
        TextView txtheadings =(TextView) view.findViewById(R.id.txtheadings) ;
        ImageView imgslide = (ImageView) view.findViewById(R.id.slideimg);
        TextView txttitle = (TextView) view.findViewById(R.id.txttitle);
        TextView txtdescription = (TextView) view.findViewById(R.id.txtdescription);
        TextView txtdescriptionn = (TextView) view.findViewById(R.id.txtdescriptionn);
        TextView txtdes = (TextView) view.findViewById(R.id.txtdes);
        TextView txt = (TextView) view.findViewById(R.id.txt);
        TextView txtdea=(TextView) view.findViewById(R.id.dea);

        txtheadings.setText(headings[position]);
        imgslide.setImageResource(images[position]);
        txttitle.setText(title[position]);
        txtdescription.setText(descriptions[position]);
        txtdescriptionn.setText(descriptionn[position]);
        txtdes.setText(des[position]);
        txt.setText(dess[position]);
        txtdea.setText(dea[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}

