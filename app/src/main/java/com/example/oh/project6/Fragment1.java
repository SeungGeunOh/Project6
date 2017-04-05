package com.example.oh.project6;

import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by OH on 2017-03-30.
 */

public class Fragment1 extends Fragment implements AdapterView.OnItemSelectedListener {
    final String Table[] = {"", "사과", "포도", "키위", "자몽"};
    Button b1, b2, b3, b4, b5, b6, b7;
    TextView t1, t2, t3, t4, t5, t6;
    Data Apple;
    Data Grape;
    Data Kiwi;
    Data GrapeFruit;
    String str;
    String DateTime[] = {"2017년 4월 7일", "18시 30분", "11시 00분", "9시 20분", "20시 40분"};
    int MemberShip[] = {10, 9, 7};
    View frag;
    LinearLayout Layout1;
    LinearLayout Layout2;
    int num, num2;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        frag = inflater.inflate(R.layout.fragment1, container, false); // 프레그먼트 레이아웃

        Apple = new Data("empty");
        Grape = new Data("empty");
        Kiwi = new Data("empty");
        GrapeFruit = new Data("empty");

        t1 = (TextView) frag.findViewById(R.id.t1);
        t2 = (TextView) frag.findViewById(R.id.t2);
        t3 = (TextView) frag.findViewById(R.id.t3);
        t4 = (TextView) frag.findViewById(R.id.t4);
        t5 = (TextView) frag.findViewById(R.id.t5);
        t6 = (TextView) frag.findViewById(R.id.t6);

        b1 = (Button) frag.findViewById(R.id.b1); // 사과테이블
        b2 = (Button) frag.findViewById(R.id.b2); // 포도테이블
        b3 = (Button) frag.findViewById(R.id.b3); // 키위테이블
        b4 = (Button) frag.findViewById(R.id.b4); // 자몽테이블
        b5 = (Button) frag.findViewById(R.id.b5); // 새 주문
        b6 = (Button) frag.findViewById(R.id.b6); // 수정
        b7 = (Button) frag.findViewById(R.id.b7); // 초기화

        b1.setOnClickListener(new View.OnClickListener() { // 사과
            @Override
            public void onClick(View v) {
                if (Apple.getTable() == "empty")
                    Toast.makeText(getActivity(), "새 주문을 해주세요.", Toast.LENGTH_SHORT).show();
                else {
                    t1.setText(Apple.getTable());
                    t2.setText(Apple.getDate() + " " + Apple.getTime());
                    t3.setText(Integer.toString(Apple.getSpag()));
                    t4.setText(Integer.toString(Apple.getPiz()));
                    if (Apple.getIndex() == 0)
                        t5.setText("멤버쉽 없음");
                    else if (Apple.getIndex() == 1)
                        t5.setText("일반 멤버쉽");
                    else
                        t5.setText("VIP 멤버쉽");
                    int result = (((Apple.getSpag() * 10000) + (Apple.getPiz() * 12000)) * MemberShip[Apple.getIndex()]) / 10;
                    t6.setText(Integer.toString(result));
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() { // 포도
            @Override
            public void onClick(View v) {
                if (Grape.getTable() == "empty")
                    Toast.makeText(getActivity(), "새 주문을 해주세요.", Toast.LENGTH_SHORT).show();
                else {
                    t1.setText(Grape.getTable());
                    t2.setText(Grape.getDate() + " " + Grape.getTime());
                    t3.setText(Integer.toString(Grape.getSpag()));
                    t4.setText(Integer.toString(Grape.getPiz()));
                    if (Grape.getIndex() == 0)
                        t5.setText("멤버쉽 없음");
                    else if (Grape.getIndex() == 1)
                        t5.setText("일반 멤버쉽");
                    else
                        t5.setText("VIP 멤버쉽");
                    int result = (((Grape.getSpag() * 10000) + (Grape.getPiz() * 12000)) * MemberShip[Grape.getIndex()]) / 10;
                    t6.setText(Integer.toString(result));
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() { // 키위
            @Override
            public void onClick(View v) {
                if (Kiwi.getTable() == "empty")
                    Toast.makeText(getActivity(), "새 주문을 해주세요.", Toast.LENGTH_SHORT).show();
                else {
                    t1.setText(Kiwi.getTable());
                    t2.setText(Kiwi.getDate() + " " + Kiwi.getTime());
                    t3.setText(Integer.toString(Kiwi.getSpag()));
                    t4.setText(Integer.toString(Kiwi.getPiz()));
                    if (Kiwi.getIndex() == 0)
                        t5.setText("멤버쉽 없음");
                    else if (Kiwi.getIndex() == 1)
                        t5.setText("일반 멤버쉽");
                    else
                        t5.setText("VIP 멤버쉽");
                    int result = (((Kiwi.getSpag() * 10000) + (Kiwi.getPiz() * 12000)) * MemberShip[Kiwi.getIndex()]) / 10;
                    t6.setText(Integer.toString(result));
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() { // 자몽
            @Override
            public void onClick(View v) {
                if (GrapeFruit.getTable() == "empty")
                    Toast.makeText(getActivity(), "새 주문을 해주세요.", Toast.LENGTH_SHORT).show();
                else {
                    t1.setText(GrapeFruit.getTable());
                    t2.setText(GrapeFruit.getDate() + " " + GrapeFruit.getTime());
                    t3.setText(Integer.toString(GrapeFruit.getSpag()));
                    t4.setText(Integer.toString(GrapeFruit.getPiz()));
                    if (GrapeFruit.getIndex() == 0)
                        t5.setText("멤버쉽 없음");
                    else if (GrapeFruit.getIndex() == 1)
                        t5.setText("일반 멤버쉽");
                    else if (GrapeFruit.getIndex() == 2)
                        t5.setText("VIP 멤버쉽");
                    int result = (((GrapeFruit.getSpag() * 10000) + (GrapeFruit.getPiz() * 12000)) * MemberShip[GrapeFruit.getIndex()]) / 10;
                    t6.setText(Integer.toString(result));
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() { // 자몽
            @Override
            public void onClick(View v) {
                View dlgview = inflater.inflate(R.layout.dialog, null); // 대화상자 레이아웃

                final EditText e1 = (EditText) dlgview.findViewById(R.id.e3);
                final EditText e2 = (EditText) dlgview.findViewById(R.id.e4);

                final TextView date = (TextView) dlgview.findViewById(R.id.date);
                final TextView time = (TextView) dlgview.findViewById(R.id.time);

                final RadioButton rb1 = (RadioButton) dlgview.findViewById(R.id.rb1);
                final RadioButton rb2 = (RadioButton) dlgview.findViewById(R.id.rb2);
                final RadioButton rb3 = (RadioButton) dlgview.findViewById(R.id.rb3);

                final Spinner spin = (Spinner) dlgview.findViewById(R.id.spinner); // 대화상자 스피너

                Layout1 = (LinearLayout) dlgview.findViewById(R.id.LinearLayout1);
                Layout2 = (LinearLayout) dlgview.findViewById(R.id.LinearLayout2);
                Layout1.setVisibility(View.VISIBLE);
                Layout2.setVisibility(View.INVISIBLE);

                AlertDialog.Builder adg = new AlertDialog.Builder(getActivity());
                ArrayAdapter adapt = ArrayAdapter.createFromResource(getActivity(), R.array.String_Table, android.R.layout.simple_spinner_dropdown_item);
                adapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spin.setAdapter(adapt);

                rb1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rb1.setChecked(true);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                    }
                });

                rb2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rb1.setChecked(false);
                        rb2.setChecked(true);
                        rb3.setChecked(false);
                    }
                });

                rb3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(true);
                    }
                });

                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        str = Table[position];
                        num = position;
                        if (position != 0) {
                            date.setText(DateTime[0]);
                            time.setText(DateTime[num]);
                        }
                        if (Apple.getDate() != null && position == 1) {
                            spin.setSelection(0);
                            date.setText(null);
                            time.setText(null);
                            Toast.makeText(getActivity(), "이미 정보가 저장되어있습니다.", Toast.LENGTH_SHORT).show();
                        }
                        else if (Grape.getDate() != null && position == 2){
                            spin.setSelection(0);
                            date.setText(null);
                            time.setText(null);
                            Toast.makeText(getActivity(), "이미 정보가 저장되어있습니다.", Toast.LENGTH_SHORT).show();
                        }
                        else if (Kiwi.getDate() != null && position == 3){
                            spin.setSelection(0);
                            date.setText(null);
                            time.setText(null);
                            Toast.makeText(getActivity(), "이미 정보가 저장되어있습니다.", Toast.LENGTH_SHORT).show();
                        }
                        else if (GrapeFruit.getDate() != null && position == 4){
                            spin.setSelection(0);
                            date.setText(null);
                            time.setText(null);
                            Toast.makeText(getActivity(), "이미 정보가 저장되어있습니다.", Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                adg.setView(dlgview);
                adg.setTitle("새 주문")
                        .setIcon(R.mipmap.ic_launcher)
                        .setNegativeButton("닫기", null)
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String Spag = e1.getText().toString();
                                String Piz = e2.getText().toString();

                                if (Spag.length() == 0 || Piz.length() == 0){
                                    e1.setText(null);
                                    e2.setText(null);
                                    Toast.makeText(getActivity(), "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                                }
                                else {
                                    int checkNum;

                                    if (rb1.isChecked())
                                        checkNum = 0;
                                    else if (rb2.isChecked())
                                        checkNum = 1;
                                    else
                                        checkNum = 2;
                                    if (num == 1)
                                        Apple = new Data(str, DateTime[0], DateTime[num], Integer.parseInt(Spag), Integer.parseInt(Piz), checkNum);
                                    else if (num == 2)
                                        Grape = new Data(str, DateTime[0], DateTime[num], Integer.parseInt(Spag), Integer.parseInt(Piz), checkNum);
                                    else if (num == 3)
                                        Kiwi = new Data(str, DateTime[0], DateTime[num], Integer.parseInt(Spag), Integer.parseInt(Piz), checkNum);
                                    else if (num == 4)
                                        GrapeFruit = new Data(str, DateTime[0], DateTime[num], Integer.parseInt(Spag), Integer.parseInt(Piz), checkNum);

                                    Snackbar.make(getView(), "저장되었습니다.", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                        }
                                    }).show();

                                    setTableName();
                                }
                            }
                        })
                        .show();


            }
        });

        b6.setOnClickListener(new View.OnClickListener() { // 자몽
            @Override
            public void onClick(View v) {
                View dlgview = inflater.inflate(R.layout.dialog, null); // 대화상자 레이아웃

                final EditText e1 = (EditText) dlgview.findViewById(R.id.et3);
                final EditText e2 = (EditText) dlgview.findViewById(R.id.et2);

                final RadioButton rb1 = (RadioButton) dlgview.findViewById(R.id.rb4);
                final RadioButton rb2 = (RadioButton) dlgview.findViewById(R.id.rb5);
                final RadioButton rb3 = (RadioButton) dlgview.findViewById(R.id.rb6);

                final Spinner spin = (Spinner) dlgview.findViewById(R.id.spinner2); // 대화상자 스피너

                Layout1 = (LinearLayout) dlgview.findViewById(R.id.LinearLayout1);
                Layout2 = (LinearLayout) dlgview.findViewById(R.id.LinearLayout2);

                Layout1.setVisibility(View.INVISIBLE);
                Layout2.setVisibility(View.VISIBLE);

                AlertDialog.Builder adg = new AlertDialog.Builder(getActivity());
                ArrayAdapter adapt = ArrayAdapter.createFromResource(getActivity(), R.array.String_Table, android.R.layout.simple_spinner_dropdown_item);
                adapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spin.setAdapter(adapt);

                rb1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rb1.setChecked(true);
                        rb2.setChecked(false);
                        rb3.setChecked(false);
                    }
                });

                rb2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rb1.setChecked(false);
                        rb2.setChecked(true);
                        rb3.setChecked(false);
                    }
                });

                rb3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rb1.setChecked(false);
                        rb2.setChecked(false);
                        rb3.setChecked(true);
                    }
                });

                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        num2 = position;

                        if (Apple.getDate() == null && position == 1) {
                            spin.setSelection(0);
                            Snackbar.make(getView(), "비어있는 테이블입니다.", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                }
                            }).show();
                        }
                        else if (Grape.getDate() == null && position == 2){
                            spin.setSelection(0);
                            Snackbar.make(getView(), "비어있는 테이블입니다.", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                }
                            }).show();
                        }
                        else if (Kiwi.getDate() == null && position == 3){
                            spin.setSelection(0);
                            Snackbar.make(getView(), "비어있는 테이블입니다.", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                }
                            }).show();
                        }
                        else if (GrapeFruit.getDate() == null && position == 4){
                            spin.setSelection(0);
                            Snackbar.make(getView(), "비어있는 테이블입니다.", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                }
                            }).show();
                        }

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                adg.setView(dlgview);
                adg.setTitle("주문 수정")
                        .setIcon(R.mipmap.ic_launcher)
                        .setNegativeButton("닫기", null)
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String Spag = e1.getText().toString();
                                String Piz = e2.getText().toString();
                                if (Spag.length() == 0 || Piz.length() == 0){
                                    e1.setText(null);
                                    e2.setText(null);
                                    Toast.makeText(getActivity(), "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                                }
                                else {
                                    int checkNum;

                                    if (rb1.isChecked())
                                        checkNum = 0;
                                    else if (rb2.isChecked())
                                        checkNum = 1;
                                    else
                                        checkNum = 2;

                                    if (num2 == 1) {
                                        Apple.setSpag(Integer.parseInt(Spag));
                                        Apple.setPiz(Integer.parseInt(Piz));
                                        Apple.setIndex(checkNum);
                                    } else if (num2 == 2) {
                                        Grape.setSpag(Integer.parseInt(Spag));
                                        Grape.setPiz(Integer.parseInt(Piz));
                                        Grape.setIndex(checkNum);
                                    } else if (num2 == 3) {
                                        Kiwi.setSpag(Integer.parseInt(Spag));
                                        Kiwi.setPiz(Integer.parseInt(Piz));
                                        Kiwi.setIndex(checkNum);
                                    } else if (num2 == 4) {
                                        GrapeFruit.setSpag(Integer.parseInt(Spag));
                                        GrapeFruit.setPiz(Integer.parseInt(Piz));
                                        GrapeFruit.setIndex(checkNum);
                                    }
                                    Snackbar.make(getView(), "저장되었습니다.", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                        }
                                    }).show();
                                    t1.setText("");
                                    t2.setText("");
                                    t3.setText("");
                                    t4.setText("");
                                    t5.setText("");
                                    t6.setText("");
                                }

                            }
                        })
                        .show();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() { // 자몽
            @Override
            public void onClick(View v) {
                AlertDialog.Builder adg = new AlertDialog.Builder(getActivity());
                adg.setTitle("초기화")
                        .setMessage("초기화를 하시겠습니까?")
                        .setNegativeButton("닫기", null)
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                b1.setText("사과 TABLE (비어있음)");
                                b2.setText("포도 TABLE (비어있음)");
                                b3.setText("키위 TABLE (비어있음)");
                                b4.setText("자몽 TABLE (비어있음)");
                                Apple = new Data("empty");
                                Grape = new Data("empty");
                                Kiwi = new Data("empty");
                                GrapeFruit = new Data("empty");
                                t1.setText("");
                                t2.setText("");
                                t3.setText("");
                                t4.setText("");
                                t5.setText("");
                                t6.setText("");
                                Snackbar.make(getView(), "초기화 되었습니다.", Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                    }
                                }).show();
                            }
                        })
                        .show();
            }

        });
        return frag;
    }

    public void setTableName() {
        if (num == 1)
            b1.setText(Table[num] + " TABLE");
        else if (num == 2)
            b2.setText(Table[num] + " TABLE");
        else if (num == 3)
            b3.setText(Table[num] + " TABLE");
        else if (num == 4)
            b4.setText(Table[num] + " TABLE");

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

}