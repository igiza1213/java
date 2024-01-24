import java.awt.Font;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.Iterator;

import javax.swing.ButtonGroup;

import javax.swing.JButton;

import javax.swing.JCheckBox;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JList;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.JRadioButton;

import javax.swing.JScrollPane;

import javax.swing.event.ListSelectionEvent;

import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.OptionPaneUI;

public class Test extends JFrame implements ListSelectionListener, ActionListener {

    // 선생님 제공 전역변수

    String[] year = { "2020", "2021", "2022", "2023" };

    Integer[] month = new Integer[12];

    String[] day = new String[31];

    JPanel p0 = new JPanel(null);

    Font defaultFont = new Font("BATANG", Font.BOLD, 20);

    // list

    JList<String> list_year = new JList<>(year);

    JList<Integer> list_month = new JList<>(month);

    JList<String> list_day = new JList<>(day);

    // radio

    JRadioButton radio_boy = new JRadioButton("남자");

    JRadioButton radio_girl = new JRadioButton("여자");

    // label

    JLabel sample = new JLabel("20603");

    // checkbox

    JCheckBox check_agree = new JCheckBox("개인 정보 제공에 동의합니다.");

    // button

    JButton btn_OK = new JButton("확인");

    JButton btn_NO = new JButton("취소");

    // 여기부터

    public static void main(String[] args) {

        // 생성자 호출 해야함

        new Test();

    }

    public Test() {

        // 기본 처리

        setTitle("20603");

        setBounds(1600, 0, 450, 500);

        add(p0);

        // 화면 보이기 : 선생님 제공

        선생님제공();

        // 리스트에 데이터 추가하기

        for (int i = 0; i < 12; i++) {

            month[i] = i + 1;

        }

        for (int i = 0; i < 31; i++)

            day[i] = Integer.toString(i + 1);

        // 라디오 버튼을 그룹으로 묶어준다.

        // ButtonGroup 생성

        ButtonGroup buttonGroup = new ButtonGroup();

        // 라디오 버튼을 ButtonGroup에 추가

        buttonGroup.add(radio_boy);
        buttonGroup.add(radio_girl);

        // 초기선택 강제 지정'

        list_year.setSelectedIndex(0);
        list_month.setSelectedIndex(0);
        list_day.setSelectedIndex(0);

        radio_boy.setSelected(true);

        // event 추가

        list_year.addListSelectionListener(this);
        list_month.addListSelectionListener(this);
        list_day.addListSelectionListener(this);

        radio_boy.addActionListener(this);
        radio_girl.addActionListener(this);

        btn_NO.addActionListener(this);
        btn_OK.addActionListener(this);

        setVisible(true);

    }

    private void 선생님제공() {

        // JScrollPane에 JList 추가

        JScrollPane scrollPane1 = new JScrollPane(list_month);

        JScrollPane scrollPane2 = new JScrollPane(list_day);

        list_year.setBounds(10, 30, 90, 160);

        scrollPane1.setBounds(120, 30, 90, 160);

        scrollPane2.setBounds(220, 30, 90, 160);

        // radio

        radio_boy.setBounds(320, 30, 80, 50);

        radio_girl.setBounds(320, 80, 80, 50);

        // LABEL등 나머지

        sample.setBounds(10, 180, 500, 50);

        check_agree.setBounds(10, 300, 500, 50);

        btn_OK.setBounds(100, 360, 80, 20);

        btn_NO.setBounds(200, 360, 80, 20);

        // all component add

        p0.add(list_year);

        p0.add(scrollPane1);

        p0.add(scrollPane2);

        p0.add(radio_boy);

        p0.add(radio_girl);

        p0.add(sample);

        p0.add(check_agree);

        p0.add(btn_OK);

        p0.add(btn_NO);

    }

    @Override

    public void actionPerformed(ActionEvent e) {// 라디오버튼, 버튼 클릭
        valueChanged();

        if (e.getSource() == btn_OK) {
            if (check_agree.isSelected()) {
                JOptionPane.showMessageDialog(null, "감사");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "안감사");

            }
        } else if (e.getSource() == btn_NO) {
            dispose();
        }

    }

    private void valueChanged() {

        // 리스트,라디오버튼의 상태를 읽어서 화면에 처리

        String y = list_year.getSelectedValue();
        int m = list_month.getSelectedValue();
        String d = list_day.getSelectedValue();

        String msg = "생년월일:" + y + "/" + m + "/" + d;

        if (radio_boy.isSelected()) {
            msg = msg + " 성별:남성";
        } else if (radio_girl.isSelected()) {
            msg = msg + " 성별:여성";
        }

        sample.setText(msg);

    }

    @Override

    public void valueChanged(ListSelectionEvent e) {// 리스트 선택 바뀔때

        // TODO Auto-generated method stub
        valueChanged();
    }

}