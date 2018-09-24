/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autozone.wittdtjr;

/**
 *
 * @author Jeremiah Stillings
 * jstillings1@nc.rr.com
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import static javax.swing.Action.ACCELERATOR_KEY;
import static javax.swing.Action.NAME;
import static javax.swing.Action.SHORT_DESCRIPTION;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


class Globals{
   public static List<String> CurrentZonersArray = new ArrayList<String>();  
   public static DefaultListModel<String> listModel = new DefaultListModel<>();
   public static JComboBox comboBox = new JComboBox(); 
   public static Integer COCTotal = 0;
   public static Integer WHitTotal = 0;
   public static Integer WMissTotal = 0;
   public static Integer RewardTotal = 0;
   public static JLabel COCT = new JLabel("Check Out Challenge Hits: " + Globals.COCTotal );
   public static JLabel RewardTotalLabel = new JLabel ("New Reward Cards Given: " + Globals.RewardTotal);
   public static JLabel WHitT = new JLabel("WITTDTJR Hits: " + Globals.WHitTotal);
   public static JLabel WMissT = new JLabel("WITTDTJR Misses: " + Globals.WMissTotal);
   public static LocalDate today = LocalDate.now();
   public static JLabel dateLabel = new JLabel(today.toString());
   public static Boolean deleted = false;
   public static Integer TopSum = 0;
   public static JLabel TopSalesmanLabel = new JLabel("The Top Salesman is: ");

   public Globals(){
       
        
    Border raisedbutton;
    raisedbutton = BorderFactory.createRaisedBevelBorder();    
    String[] CurrentZoners = CurrentZonersArray.toArray(new String[0]);
      
  
    /*
    System.out.println( "Starting list");
        for( String name : CurrentZoners ) {
      
         System.out.print(name + " ");
        } 
    System.out.println( "");
    */
    Globals.COCT.setFont(new Font("Serif", Font.BOLD, 24));
    Globals.COCT.setBorder(raisedbutton);
    Dimension d = Globals.COCT.getPreferredSize();
    Globals.COCT.setPreferredSize(new Dimension(d.width+60,d.height));
    Globals.WHitT.setFont(new Font("Serif", Font.BOLD, 24));
    Globals.WHitT.setBorder(raisedbutton);
    Globals.WMissT.setFont(new Font("Serif", Font.BOLD, 24));
    Globals.WMissT.setBorder(raisedbutton);
    Globals.RewardTotalLabel.setFont(new Font("Serif", Font.BOLD, 24));
    Globals.RewardTotalLabel.setBorder(raisedbutton);
    Globals.dateLabel.setFont(new Font("Serif", Font.BOLD, 36));
    Globals.TopSalesmanLabel.setFont(new Font("Serif", Font.BOLD, 24));
     Globals.TopSalesmanLabel.setBorder(raisedbutton);
    }
}
 public class AutoZoneWITTDTJR extends JFrame {

  public JTextPane pane;

  public JMenuBar menuBar;

  public JToolBar toolBar;   
  Tracker tracker1 = null;
  Tracker tracker2 = null;
  Tracker tracker3 = null;
  Tracker tracker4 = null;
  Tracker tracker5 = null;
  Tracker tracker6 = null;
  Tracker tracker7 = null;
  Tracker tracker8 = null;
  Tracker tracker9 = null;
  Tracker tracker10 = null;
  Tracker tracker11 = null;
  Tracker tracker12 = null;
  Tracker tracker13 = null;
  Tracker tracker14 = null;
  Tracker tracker15 = null;
  Tracker tracker16 = null;
  Tracker tracker17 = null;
  Tracker tracker18 = null;
  Tracker tracker19 = null;
  Tracker tracker20 = null;
  Tracker tracker21 = null;
  Tracker tracker22 = null;
  Tracker tracker23 = null;
  Tracker tracker24 = null;
  Tracker tracker25 = null;
  int firstrun = 0; 
  Integer i = 25;
  String temp ="";
  
  
   
  
 

 class Tracker {
    private Integer wHitCounter = 0 ;
    private Integer wMissCounter = 0;
    private Integer COCCounter = 0 ;
    private Integer RewardCounter = 0;
    private Integer LocalSum = 0;
    private JFrame frame1;
    private JLabel CheckOutChallenge = new JLabel("Check Out Challenge Hits: " + wHitCounter);
    private JLabel WCounter = new JLabel("WITTDTJR Hits: " + wHitCounter );
    private JLabel WMissCounter = new JLabel("WITTDTJR Misses: " + wHitCounter );
    private JLabel RewardCounterLabel = new JLabel("New Rewards: " + RewardCounter);
    public Tracker()
    {
     // Column space   
     Integer c1= 210;
     Integer c2 = 400;
     Integer c3 = 600;
     Integer c4 = 800;
     Integer plusC = 900;
     Integer minusC = 1000;
     // controls row spacing
     Integer rowSpace = 40;
     // Row space
     Integer r0 = 50;
     Integer r1 = r0 + rowSpace;
     Integer r2 = r1 + rowSpace;
     Integer r3 = r2 + rowSpace;
     Integer r4 = r3 + rowSpace;
     Integer r5 = r4 + rowSpace;
     Integer r6 = r5 + rowSpace;
     Integer r7 = r6 + rowSpace;
     Integer r8 = r7 + rowSpace;
     Integer r9 = r8 + rowSpace;
     Integer r10 = r9 + rowSpace;
     Integer r11 = r10 + rowSpace;
     Integer r12 = r11 + rowSpace;
     Integer r13 = r12 + rowSpace;
     Integer r14 = r13 + rowSpace;
     Integer r15 = r14 + rowSpace;
     Integer r16 = r15 + rowSpace;
     // space below row to put seperator
     Integer sepadd = 35;
     
             
     Border blackline,raisedbutton;
     blackline = BorderFactory.createLineBorder(Color.BLACK);
     raisedbutton = BorderFactory.createRaisedBevelBorder();
     // Headers
     JLabel soldLabel = new JLabel("Product Sold");
     soldLabel.setFont(new Font("Serif", Font.BOLD, 20));
     JLabel hitOrMiss = new JLabel("Hit or Miss");
     hitOrMiss.setFont(new Font("Serif", Font.BOLD, 20));
     JLabel wittdtjrProducts = new JLabel("Possible WITTDTJR Hits");
     wittdtjrProducts.setFont(new Font("Serif", Font.BOLD, 20));
     // Categories   
     JLabel OilFilter = new JLabel("Oil Filter");
     OilFilter.setBorder(raisedbutton);
     OilFilter.setFont(new Font("Serif", Font.BOLD, 16));
     JLabel AirFilter = new JLabel("Air Filter");
     AirFilter.setFont(new Font("Serif", Font.BOLD, 16));
     AirFilter.setBorder(raisedbutton);
     JLabel BrakePads = new JLabel("Brake Pads or Brake Shoes");
     BrakePads.setFont(new Font("Serif", Font.BOLD, 16));
     BrakePads.setBorder(raisedbutton);
     JLabel BrakeRotors  = new JLabel("Brake Rotors or Drums");
     BrakeRotors.setFont(new Font("Serif", Font.BOLD, 16));
     BrakeRotors.setBorder(raisedbutton);
     JLabel BrakeCalipers = new JLabel("Brake Caliper");
     BrakeCalipers.setFont(new Font("Serif", Font.BOLD, 16));
     BrakeCalipers.setBorder(raisedbutton);
     JLabel Battery = new JLabel("Battery");
     Battery.setFont(new Font("Serif", Font.BOLD, 16));
     Battery.setBorder(raisedbutton);
     JLabel Belt = new JLabel("Belt");
     Belt.setFont(new Font("Serif", Font.BOLD, 16));
     Belt.setBorder(raisedbutton);
     JLabel Compressor = new JLabel("AC Compressor");
     Compressor.setFont(new Font("Serif", Font.BOLD, 16));
     Compressor.setBorder(raisedbutton);
     JLabel Alternator = new JLabel("Alternator");
     Alternator.setFont(new Font("Serif", Font.BOLD, 16));
     Alternator.setBorder(raisedbutton);     
     JLabel FuelPump = new JLabel("Fuel Pump");
     FuelPump.setFont(new Font("Serif", Font.BOLD, 16));
     FuelPump.setBorder(raisedbutton);
     JLabel MasterCyl = new JLabel("Brake Master Cylinder");
     MasterCyl.setFont(new Font("Serif", Font.BOLD, 16));
     MasterCyl.setBorder(raisedbutton);
     JLabel Radiator = new JLabel("Radiator");
     Radiator.setFont(new Font("Serif", Font.BOLD, 16));
     Radiator.setBorder(raisedbutton);
     JLabel SparkPlugs = new JLabel("Spark Plugs");
     SparkPlugs.setFont(new Font("Serif", Font.BOLD, 16));
     SparkPlugs.setBorder(raisedbutton);
     JLabel Thermostat = new JLabel("Thermostat");
     Thermostat.setFont(new Font("Serif", Font.BOLD, 16));
     Thermostat.setBorder(raisedbutton);
     JLabel WaterPump = new JLabel("Water Pump");
     WaterPump.setFont(new Font("Serif", Font.BOLD, 16));
     WaterPump.setBorder(raisedbutton);
     JLabel Wipers = new JLabel("Wipers");
     Wipers.setFont(new Font("Serif", Font.BOLD, 16));
     Wipers.setBorder(raisedbutton);
    // End Categories 
    // Counters
     
     CheckOutChallenge.setFont(new Font("Serif", Font.BOLD, 20));
     CheckOutChallenge.setBorder(raisedbutton);
    
     WCounter.setFont(new Font("Serif", Font.BOLD, 20));
     WCounter.setBorder(raisedbutton);
    
     WMissCounter.setFont(new Font("Serif", Font.BOLD, 20));
     WMissCounter.setBorder(raisedbutton);
     RewardCounterLabel.setFont(new Font("Serif", Font.BOLD, 20));
     RewardCounterLabel.setBorder(raisedbutton);
    // end Counters 
    // Hits
     
     JLabel HitAirFilter = new JLabel("Air Filter");
     JLabel HitPCVValve = new JLabel("PCV Valve");
     JLabel HitPCVValve2 = new JLabel("PCV Valve");
     JLabel HitFuelFilter = new JLabel("Fuel Filter");
     JLabel HitRotors = new JLabel("Rotors");
     JLabel HitRotors2 = new JLabel("Rotors");
     JLabel HitBrakeKit = new JLabel("Brake Kit");
     JLabel HitBrakeKit2 = new JLabel("Brake Kit");
     JLabel HitBrakeCleaner = new JLabel("Brake Cleaner");
     JLabel HitBrakePads = new JLabel("Brake Pads");
     JLabel HitBrakePads2 = new JLabel("Brake Pads");
     JLabel HitBrakeHoses = new JLabel("Brake Hoses");
     JLabel HitBrakeHardware = new JLabel("Brake Hardware");
     JLabel HitBatteryCable = new JLabel("Battery Cable");
     JLabel HitBatteryGrease = new JLabel("Battery Grease");
     JLabel HitBeltTool = new JLabel("Belt Removal Tool");
     JLabel HitBeltTensioner = new JLabel("Belt Tensioner");
     JLabel HitBeltIdler = new JLabel("Belt Idler");
     JLabel HitAccumulator = new JLabel("AC Accumulator");
     JLabel HitOrficeTube = new JLabel("AC Orfice Tube");
     JLabel HitBelt = new JLabel("Belt");
     JLabel HitBelt2 = new JLabel("Belt");
     JLabel HitBeltTool2 = new JLabel("Belt Removal Tool");
     JLabel HitStrainer  = new JLabel("Fuel Pump Strainer");
     JLabel HitFuelFilter2 = new JLabel("Fuel Filter");
     JLabel HitBrakeFluid = new JLabel("Brake Fluid");
     JLabel HitRadiatorCap = new JLabel("Radiator Cap");
     JLabel HitRadiatorHose = new JLabel("Radiator Upper or Lower Hose");
     JLabel HitThermostat = new JLabel("Thermostat");
     JLabel HitWireSet = new JLabel("Spark Plug Wire Set");
     JLabel HitDistributorCap = new JLabel("Disributor Cap");
     JLabel HitIgnitionRotor = new JLabel("Ignition Rotor");
     JLabel HitThermostatGasket = new JLabel("Thermostat Gasket");
     JLabel HitRTV = new JLabel("RTV");
     JLabel HitRadiatorHose2 = new JLabel("Radiator Upper or Lower Hose");
     JLabel HitBelt3 = new JLabel("Belt");
     JLabel HitRTV2 = new JLabel("RTV");
     JLabel HitRadiatorHose3 = new JLabel("Radiator Upper or Lower Hose");
     JLabel HitWasherFluid = new JLabel("Washer Fluid");
     JLabel HitGlassCleaner = new JLabel("Glass Cleaner");
     
     
     // End Hits
     // Add seperators
    
     JSeparator sep1 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep2 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep3 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep4 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep5 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep6 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep7 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep8 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep9 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep10 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep11 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep12 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep13 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep14 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep15 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep16 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep17 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep18 = new JSeparator(SwingConstants.HORIZONTAL);
     JSeparator sep19 = new JSeparator(SwingConstants.HORIZONTAL);
    // assign size to each one
    sep1.setPreferredSize(new Dimension(1100,3));
    sep2.setPreferredSize(new Dimension(1100,3));
    sep3.setPreferredSize(new Dimension(1100,3));
    sep4.setPreferredSize(new Dimension(1100,3));
    sep5.setPreferredSize(new Dimension(1100,3));
    sep6.setPreferredSize(new Dimension(1100,3));
    sep7.setPreferredSize(new Dimension(1100,3));
    sep8.setPreferredSize(new Dimension(1100,3));
    sep9.setPreferredSize(new Dimension(1100,3));
    sep10.setPreferredSize(new Dimension(1100,3));
    sep11.setPreferredSize(new Dimension(1100,3));
    sep12.setPreferredSize(new Dimension(1100,3));
    sep13.setPreferredSize(new Dimension(1100,3));
    sep14.setPreferredSize(new Dimension(1100,3));
    sep15.setPreferredSize(new Dimension(1100,3));
    sep16.setPreferredSize(new Dimension(1100,3));
    sep17.setPreferredSize(new Dimension(1100,3));
    sep18.setPreferredSize(new Dimension(1100,3));
    sep19.setPreferredSize(new Dimension(1100,3));
    // set up vertical separators
    JSeparator vsep1 = new JSeparator(SwingConstants.VERTICAL);
    JSeparator vsep2 = new JSeparator(SwingConstants.VERTICAL);
    JSeparator vsep3 = new JSeparator(SwingConstants.VERTICAL);
    // assign size to each one
    vsep1.setPreferredSize(new Dimension(3,780));
    vsep2.setPreferredSize(new Dimension(3,780));
    vsep3.setPreferredSize(new Dimension(3,780));
  
      // Create form
     Object choice =(Globals.comboBox )
                      .getSelectedItem();
     frame1 = new JFrame();
     frame1.setTitle("Zoner: " + choice);
     frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
     frame1.setSize(1280,780);
     
     
     Container contentPane = frame1.getContentPane();
    
    
     
     // WITTDTJR Hit button
     java.net.URL imageURL = AutoZoneWITTDTJR.class.getResource("Plus.jpg");
     ImageIcon wicon = new ImageIcon(imageURL);
     JButton plusButton = new JButton("Sold", wicon); 
     plusButton.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    plusButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wHitCounter = wHitCounter + 1;
            Globals.WHitTotal = Globals.WHitTotal + 1; 
            WCounter.setText("WITTDTJR Hits: " + wHitCounter);
            Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
            // add code to determine top salesperson
            LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
         Globals.TopSum= LocalSum;     
     }
            
         }          
      });
    // WITTDTJR Hit button 2
     
     JButton plusButton2 = new JButton("Sold", wicon); 
      plusButton2.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    plusButton2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wHitCounter = wHitCounter + 1;
            Globals.WHitTotal = Globals.WHitTotal + 1; 
            WCounter.setText("WITTDTJR Hits: " + wHitCounter);
            Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
            
         }          
      });
    // WITTDTJR Hit button 3
     
     JButton plusButton3 = new JButton("Sold", wicon);
      plusButton3.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    plusButton3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wHitCounter = wHitCounter + 1;
            Globals.WHitTotal = Globals.WHitTotal + 1; 
            WCounter.setText("WITTDTJR Hits: " + wHitCounter);
            Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Hit button 4
     
     JButton plusButton4 = new JButton("Sold", wicon);
      plusButton4.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    plusButton4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wHitCounter = wHitCounter + 1;
            Globals.WHitTotal = Globals.WHitTotal + 1; 
            WCounter.setText("WITTDTJR Hits: " + wHitCounter);
            Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Hit button 5
     
     JButton plusButton5 = new JButton("Sold", wicon);
      plusButton5.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    plusButton5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wHitCounter = wHitCounter + 1;
            Globals.WHitTotal = Globals.WHitTotal + 1; 
            WCounter.setText("WITTDTJR Hits: " + wHitCounter);
            Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Hit button 6
     
     JButton plusButton6  = new JButton("Sold", wicon);
      plusButton6.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    plusButton6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wHitCounter = wHitCounter + 1;
            Globals.WHitTotal = Globals.WHitTotal + 1; 
            WCounter.setText("WITTDTJR Hits: " + wHitCounter);
            Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Hit button 7
     
     JButton plusButton7 = new JButton("Sold", wicon);
      plusButton7.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    plusButton7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wHitCounter = wHitCounter + 1;
            Globals.WHitTotal = Globals.WHitTotal + 1; 
            WCounter.setText("WITTDTJR Hits: " + wHitCounter);
            Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Hit button 8
     
     JButton plusButton8 = new JButton("Sold", wicon);
      plusButton8.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    plusButton8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wHitCounter = wHitCounter + 1;
            Globals.WHitTotal = Globals.WHitTotal + 1; 
            WCounter.setText("WITTDTJR Hits: " + wHitCounter);
            Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Hit button 9
     
     JButton plusButton9 = new JButton("Sold", wicon);
      plusButton9.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    plusButton9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wHitCounter = wHitCounter + 1;
            Globals.WHitTotal = Globals.WHitTotal + 1; 
            WCounter.setText("WITTDTJR Hits: " + wHitCounter);
            Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Hit button 10
     
     JButton plusButton10 = new JButton("Sold", wicon);
      plusButton10.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    plusButton10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wHitCounter = wHitCounter + 1;
            Globals.WHitTotal = Globals.WHitTotal + 1; 
            WCounter.setText("WITTDTJR Hits: " + wHitCounter);
            Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Hit button 11
     
     JButton plusButton11 = new JButton("Sold", wicon);
      plusButton11.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    plusButton11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wHitCounter = wHitCounter + 1;
            Globals.WHitTotal = Globals.WHitTotal + 1; 
            WCounter.setText("WITTDTJR Hits: " + wHitCounter);
            Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Hit button 12
     
     JButton plusButton12 = new JButton("Sold", wicon);
      plusButton12.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    plusButton12.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wHitCounter = wHitCounter + 1;
            Globals.WHitTotal = Globals.WHitTotal + 1; 
            WCounter.setText("WITTDTJR Hits: " + wHitCounter);
            Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Hit button 13
     
     JButton plusButton13 = new JButton("Sold", wicon);
      plusButton13.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    plusButton13.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wHitCounter = wHitCounter + 1;
            Globals.WHitTotal = Globals.WHitTotal + 1; 
            WCounter.setText("WITTDTJR Hits: " + wHitCounter);
            Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Hit button 14
     
     JButton plusButton14 = new JButton("Sold", wicon);
      plusButton14.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    plusButton14.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wHitCounter = wHitCounter + 1;
            Globals.WHitTotal = Globals.WHitTotal + 1; 
            WCounter.setText("WITTDTJR Hits: " + wHitCounter);
            Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Hit button 15
     
     JButton plusButton15 = new JButton("Sold", wicon);
      plusButton15.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    plusButton15.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wHitCounter = wHitCounter + 1;
            Globals.WHitTotal = Globals.WHitTotal + 1; 
            WCounter.setText("WITTDTJR Hits: " + wHitCounter);
            Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
     // WITTDTJR Hit button 16
     
     JButton plusButton16 = new JButton("Sold", wicon);
      plusButton16.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    plusButton16.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wHitCounter = wHitCounter + 1;
            Globals.WHitTotal = Globals.WHitTotal + 1; 
            WCounter.setText("WITTDTJR Hits: " + wHitCounter);
            Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // Wittd
    // Wittdtjt miss button
    
     java.net.URL imageURL2 = AutoZoneWITTDTJR.class.getResource("Miss.jpg");
     ImageIcon wicon2 = new ImageIcon(imageURL2);
     JButton missButton = new JButton("Miss", wicon2); 
     missButton.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    missButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wMissCounter = wMissCounter + 1;
            Globals.WMissTotal = Globals.WMissTotal + 1; 
            WMissCounter.setText("WITTDTJR Misses: " + wMissCounter);
            Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
            
         }          
      });
    // WITTDTJR Miss button 2
     
     JButton missButton2 = new JButton("Miss", wicon2); 
      missButton2.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    missButton2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wMissCounter = wMissCounter + 1;
            Globals.WMissTotal = Globals.WMissTotal + 1; 
            WMissCounter.setText("WITTDTJR Misses: " + wMissCounter);
            Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
            
         }          
      });
    // WITTDTJR Miss button 3
     
     JButton missButton3 = new JButton("Miss", wicon2);
      missButton3.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    missButton3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wMissCounter = wMissCounter + 1;
            Globals.WMissTotal = Globals.WMissTotal + 1; 
            WMissCounter.setText("WITTDTJR Misses: " + wMissCounter);
            Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Miss button 4
     
     JButton missButton4 = new JButton("Miss", wicon2);
      missButton4.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    missButton4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wMissCounter = wMissCounter + 1;
            Globals.WMissTotal = Globals.WMissTotal + 1; 
            WMissCounter.setText("WITTDTJR Misses: " + wMissCounter);
            Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Miss button 5
     
     JButton missButton5 = new JButton("Miss", wicon2);
      missButton5.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    missButton5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wMissCounter = wMissCounter + 1;
            Globals.WMissTotal = Globals.WMissTotal + 1; 
            WMissCounter.setText("WITTDTJR Misses: " + wMissCounter);
            Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Miss button 6
     
     JButton missButton6  = new JButton("Miss", wicon2);
      missButton6.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    missButton6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wMissCounter = wMissCounter + 1;
            Globals.WMissTotal = Globals.WMissTotal + 1; 
            WMissCounter.setText("WITTDTJR Misses: " + wMissCounter);
            Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Miss button 7
     
     JButton missButton7 = new JButton("Miss", wicon2);
      missButton7.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    missButton7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wMissCounter = wMissCounter + 1;
            Globals.WMissTotal = Globals.WMissTotal + 1; 
            WMissCounter.setText("WITTDTJR Misses: " + wMissCounter);
            Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Miss button 8
     
     JButton missButton8 = new JButton("Miss", wicon2);
      missButton8.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    missButton8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wMissCounter = wMissCounter + 1;
            Globals.WMissTotal = Globals.WMissTotal + 1; 
            WMissCounter.setText("WITTDTJR Misses: " + wMissCounter);
            Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Miss button 9
     
     JButton missButton9 = new JButton("Miss", wicon2);
      missButton9.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    missButton9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wMissCounter = wMissCounter + 1;
            Globals.WMissTotal = Globals.WMissTotal + 1; 
            WMissCounter.setText("WITTDTJR Misses: " + wMissCounter);
            Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Miss button 10
     
     JButton missButton10 = new JButton("Miss", wicon2);
      missButton10.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    missButton10.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wMissCounter = wMissCounter + 1;
            Globals.WMissTotal = Globals.WMissTotal + 1; 
            WMissCounter.setText("WITTDTJR Misses: " + wMissCounter);
            Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Miss button 11
     
     JButton missButton11 = new JButton("Miss", wicon2);
      missButton11.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    missButton11.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wMissCounter = wMissCounter + 1;
            Globals.WMissTotal = Globals.WMissTotal + 1; 
            WMissCounter.setText("WITTDTJR Misses: " + wMissCounter);
            Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Miss button 12
     
     JButton missButton12 = new JButton("Miss", wicon2);
      missButton12.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    missButton12.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wMissCounter = wMissCounter + 1;
            Globals.WMissTotal = Globals.WMissTotal + 1; 
            WMissCounter.setText("WITTDTJR Misses: " + wMissCounter);
            Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Miss button 13
     
     JButton missButton13 = new JButton("Miss", wicon2);
      missButton13.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    missButton13.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wMissCounter = wMissCounter + 1;
            Globals.WMissTotal = Globals.WMissTotal + 1; 
            WMissCounter.setText("WITTDTJR Misses: " + wMissCounter);
            Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Miss button 14
     
     JButton missButton14 = new JButton("Miss", wicon2);
      missButton14.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    missButton14.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wMissCounter = wMissCounter + 1;
            Globals.WMissTotal = Globals.WMissTotal + 1; 
            WMissCounter.setText("WITTDTJR Misses: " + wMissCounter);
            Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // WITTDTJR Miss button 15
     
     JButton missButton15 = new JButton("Miss", wicon2);
      missButton15.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    missButton15.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wMissCounter = wMissCounter + 1;
            Globals.WMissTotal = Globals.WMissTotal + 1; 
            WMissCounter.setText("WITTDTJR Misses: " + wMissCounter);
            Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
   
     // WITTDTJR Miss button 16
     
     JButton missButton16 = new JButton("Miss", wicon2);
      missButton16.setFont(new Font("Serif", Font.BOLD, 16));
     // Plus button listener
    missButton16.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            wMissCounter = wMissCounter + 1;
            Globals.WMissTotal = Globals.WMissTotal + 1; 
            WMissCounter.setText("WITTDTJR Misses: " + wMissCounter);
            Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
    // COC Hit Button
    java.net.URL imageURL3 =AutoZoneWITTDTJR.class.getResource("Plus.jpg");
     ImageIcon COCicon = new ImageIcon(imageURL3);
  
     JButton COCButton = new JButton("COC Sold", COCicon); 
     // Plus button listener
    COCButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            COCCounter = COCCounter + 1;
            Globals.COCTotal = Globals.COCTotal + 1; 
            CheckOutChallenge.setText("Check Out Challenge Hits: " + COCCounter);
            Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
     // Reward card  Button
    java.net.URL imageURL4 = AutoZoneWITTDTJR.class.getResource("Plus.jpg");
     ImageIcon RewardIcon4 = new ImageIcon(imageURL4);
  
     JButton RewardButton = new JButton("New Reward", RewardIcon4); 
     // Reward Card button listener
    RewardButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Add to WITTDTJR Counter
            RewardCounter = RewardCounter + 1;
            RewardCounterLabel.setText("New Rewards : " + RewardCounter);
            Globals.RewardTotal = Globals.RewardTotal + 1; 
            Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
            // add code to determine top salesperson
     LocalSum =  wHitCounter - wMissCounter + COCCounter + RewardCounter;
     if (LocalSum > Globals.TopSum)
     {
         Globals.TopSalesmanLabel.setText("The Top Salesman is " + frame1.getTitle());
          Globals.TopSum= LocalSum;
                 
     }
         }          
      });
     
     
    
     //Set up Gui form
     
    SpringLayout layout = new SpringLayout();
    contentPane.setLayout(layout);
  
    // Check out challenge Sold Button
    layout.putConstraint(SpringLayout.WEST, COCButton,
                    5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, COCButton,
                 5,
                        SpringLayout.NORTH, contentPane);
    
    // Check out Challenge 
    layout.putConstraint(SpringLayout.WEST, CheckOutChallenge,
                    150,
                     SpringLayout.WEST, COCButton);
    layout.putConstraint(SpringLayout.NORTH, CheckOutChallenge,
                 5,
                        SpringLayout.NORTH, contentPane);
    // Moves the WITTDTJR counter to the 100 px right
    layout.putConstraint(SpringLayout.WEST, WCounter,
                     40,
                     SpringLayout.EAST, CheckOutChallenge);
    layout.putConstraint(SpringLayout.NORTH, WCounter,
                     5,
                     SpringLayout.NORTH, contentPane);
    // Moves the WITTDTJR Miss  counter to the 100 px right
    layout.putConstraint(SpringLayout.WEST, WMissCounter,
                     40,
                     SpringLayout.EAST, WCounter);
    layout.putConstraint(SpringLayout.NORTH, WMissCounter,
                     5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, RewardCounterLabel,
                     40,
                     SpringLayout.EAST, WMissCounter);
    layout.putConstraint(SpringLayout.NORTH, RewardCounterLabel,
                     5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, RewardButton,
                     40,
                     SpringLayout.EAST, RewardCounterLabel);
    layout.putConstraint(SpringLayout.NORTH, RewardButton,
                     5,
                     SpringLayout.NORTH, contentPane);
    
  // set up headers

      layout.putConstraint(SpringLayout.WEST, soldLabel,
                    5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, soldLabel,
                 r0,
                        SpringLayout.NORTH, contentPane);
    // Moves the Sold button to the plusC px to the right of Oil Filter
    layout.putConstraint(SpringLayout.WEST, hitOrMiss,
                    plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, hitOrMiss,
                   r0-5,
                     SpringLayout.NORTH, contentPane);
    
    layout.putConstraint(SpringLayout.WEST, wittdtjrProducts,
                   c1,
                     SpringLayout.WEST, contentPane);
     layout.putConstraint(SpringLayout.NORTH, wittdtjrProducts,
                 r0,
                        SpringLayout.NORTH, contentPane);
  
  // Set up first row
      layout.putConstraint(SpringLayout.WEST, OilFilter,
                    5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, OilFilter,
                 r1,
                        SpringLayout.NORTH, contentPane);
    // Moves the Sold button to the plusC px to the right of Oil Filter
    layout.putConstraint(SpringLayout.WEST, plusButton,
                    plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, plusButton,
                   r1-5,
                     SpringLayout.NORTH, contentPane);
    
    // add miss button 1-30-2017 revision
    layout.putConstraint(SpringLayout.WEST, missButton,
                    minusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, missButton,
                   r1-5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitAirFilter,
                   c1,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitAirFilter,
                  r1,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitPCVValve,
                   c2,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitPCVValve,
                 r1,
                        SpringLayout.NORTH, contentPane);
    
    //Set up second row
    
    layout.putConstraint(SpringLayout.WEST, AirFilter,
                     5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, AirFilter,
                   r2,
                        SpringLayout.NORTH, contentPane);
     layout.putConstraint(SpringLayout.WEST, plusButton2,
                    plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, plusButton2,
                     r2-5,
                     SpringLayout.NORTH, contentPane);
    // add miss button 1-30-2017 revision
    layout.putConstraint(SpringLayout.WEST, missButton2,
                    minusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, missButton2,
                   r2-5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitPCVValve2,
                   c1,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitPCVValve2,
                  r2,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitFuelFilter,
                  c2,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitFuelFilter,
                  r2,
                        SpringLayout.NORTH, contentPane);
    
    //Set up 3rd row
    
    layout.putConstraint(SpringLayout.WEST, BrakeRotors,
                     5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, BrakeRotors,
                   r3,
                        SpringLayout.NORTH, contentPane);
     layout.putConstraint(SpringLayout.WEST, plusButton3,
                   plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, plusButton3,
                     r3-5,
                     SpringLayout.NORTH, contentPane);
    // add miss button 1-30-2017 revision
    layout.putConstraint(SpringLayout.WEST, missButton3,
                    minusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, missButton3,
                   r3-5,
                     SpringLayout.NORTH, contentPane);
     layout.putConstraint(SpringLayout.WEST, HitRotors,
                  c1,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitRotors,
                  r3,
                        SpringLayout.NORTH, contentPane);
     layout.putConstraint(SpringLayout.WEST, HitBrakeKit,
                  c2,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBrakeKit,
                  r3,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitBrakeCleaner,
                  c3,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBrakeCleaner,
                  r3,
                        SpringLayout.NORTH, contentPane);

    //Set up 4th row   
    layout.putConstraint(SpringLayout.WEST, BrakePads,
                     5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, BrakePads,
                   r4,
                        SpringLayout.NORTH, contentPane);
     layout.putConstraint(SpringLayout.WEST, plusButton4,
                    plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, plusButton4,
                    r4-5,
                     SpringLayout.NORTH, contentPane);
    // add miss button 1-30-2017 revision
    layout.putConstraint(SpringLayout.WEST, missButton4,
                    minusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, missButton4,
                   r4-5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitBrakePads,
                  c1,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBrakePads,
                  r4,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitBrakeKit2,
                  c2,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBrakeKit2,
                  r4,
                        SpringLayout.NORTH, contentPane);
    //Set up 5th row
    
    layout.putConstraint(SpringLayout.WEST, BrakeCalipers,
                     5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, BrakeCalipers,
                   r5,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, plusButton5,
                    plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, plusButton5,
                   r5-5,
                     SpringLayout.NORTH, contentPane);
    // add miss button 1-30-2017 revision
    layout.putConstraint(SpringLayout.WEST, missButton5,
                    minusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, missButton5,
                   r5-5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitBrakePads2,
                  c1,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBrakePads2,
                  r5,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitBrakeHoses,
                  c2,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBrakeHoses,
                    r5,
                        SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, HitRotors2,
                  c3,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitRotors2,
                   r5,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitBrakeHardware,
                  c4,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBrakeHardware,
                   r5,
                        SpringLayout.NORTH, contentPane);
    //Set up 6th row
    
    layout.putConstraint(SpringLayout.WEST, Battery,
                     5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, Battery,
                   r6,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, plusButton6,
                    plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, plusButton6,
                   r6-5,
                     SpringLayout.NORTH, contentPane);
    // add miss button 1-30-2017 revision
    layout.putConstraint(SpringLayout.WEST, missButton6,
                    minusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, missButton6,
                   r6-5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitBatteryCable,
                  c1,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBatteryCable,
                    r6,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitBatteryGrease,
                  c2,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBatteryGrease,
                   r6,
                        SpringLayout.NORTH, contentPane);
    //Set up 7th row
    
    layout.putConstraint(SpringLayout.WEST, Belt,
                     5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, Belt,
                   r7,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, plusButton7,
                    plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, plusButton7,
                    r7-5,
                     SpringLayout.NORTH, contentPane);
    // add miss button 1-30-2017 revision
    layout.putConstraint(SpringLayout.WEST, missButton7,
                    minusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, missButton7,
                   r7-5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitBeltTool,
                  c1,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBeltTool,
                  r7,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitBeltTensioner,
                 c2,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBeltTensioner,
                  r7,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitBeltIdler,
                 c3,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBeltIdler,
                  r7,
                        SpringLayout.NORTH, contentPane);
    
    //Set up 8th row
    
    layout.putConstraint(SpringLayout.WEST, Compressor,
                     5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, Compressor,
                   r8,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, plusButton8,
                    plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, plusButton8,
                    r8-5,
                     SpringLayout.NORTH, contentPane);
    // add miss button 1-30-2017 revision
    layout.putConstraint(SpringLayout.WEST, missButton8,
                    minusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, missButton8,
                   r8-5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitAccumulator,
                 c1,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitAccumulator,
                 r8,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitOrficeTube,
                 c2,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitOrficeTube,
                   r8,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitBelt,
                 c3,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBelt,
                   r8,
                        SpringLayout.NORTH, contentPane);
    //Set up 9th row
    
    layout.putConstraint(SpringLayout.WEST, Alternator,
                     5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, Alternator,
                   r9,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, plusButton9,
                    plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, plusButton9,
                    r9-5,
                     SpringLayout.NORTH, contentPane);
    // add miss button 1-30-2017 revision
    layout.putConstraint(SpringLayout.WEST, missButton9,
                    minusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, missButton9,
                   r9-5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitBelt2,
                 c1,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBelt2,
                   r9,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitBeltTool2,
                 c2,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBeltTool2,
                   r9,
                        SpringLayout.NORTH, contentPane);
    //Set up 10th row
    
    layout.putConstraint(SpringLayout.WEST, FuelPump,
                     5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, FuelPump,
                   r10,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, plusButton10,
                    plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, plusButton10,
                    r10-5,
                     SpringLayout.NORTH, contentPane);
    // add miss button 1-30-2017 revision
    layout.putConstraint(SpringLayout.WEST, missButton10,
                    minusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, missButton10,
                   r10-5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitStrainer,
                 c1,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitStrainer,
                   r10,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitFuelFilter2,
                 c2,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitFuelFilter2,
                   r10,
                        SpringLayout.NORTH, contentPane);
    //Set up 11th row
    
    layout.putConstraint(SpringLayout.WEST, MasterCyl,
                     5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, MasterCyl,
                   r11,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, plusButton11,
                    plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, plusButton11,
                  r11-5,
                     SpringLayout.NORTH, contentPane);
    // add miss button 1-30-2017 revision
    layout.putConstraint(SpringLayout.WEST, missButton11,
                    minusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, missButton11,
                   r11-5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitBrakeFluid,
                 c1,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBrakeFluid,
                 r11,
                        SpringLayout.NORTH, contentPane);
    //Set up 12th row
    
    layout.putConstraint(SpringLayout.WEST, Radiator,
                     5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, Radiator,
                   r12,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, plusButton12,
                    plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, plusButton12,
                    r12-5,
                     SpringLayout.NORTH, contentPane);
    // add miss button 1-30-2017 revision
    layout.putConstraint(SpringLayout.WEST, missButton12,
                    minusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, missButton12,
                   r12-5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitRadiatorCap,
                 c1,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitRadiatorCap,
                  r12,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitRadiatorHose,
                 c2,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitRadiatorHose,
                 r12,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitThermostat,
                 c3,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitThermostat,
                  r12,
                        SpringLayout.NORTH, contentPane);
    //Set up 13th row
    
    layout.putConstraint(SpringLayout.WEST, SparkPlugs,
                     5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, SparkPlugs,
                   r13,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, plusButton13,
                    plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, plusButton13,
                   r13-5,
                     SpringLayout.NORTH, contentPane);
    // add miss button 1-30-2017 revision
    layout.putConstraint(SpringLayout.WEST, missButton13,
                    minusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, missButton13,
                   r13-5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitWireSet,
                 c1,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitWireSet,
                  r13,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitDistributorCap,
                 c2,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitDistributorCap,
                  r13,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitIgnitionRotor,
                 c3,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitIgnitionRotor,
                 r13,
                        SpringLayout.NORTH, contentPane);
    //Set up 14th row
    
    layout.putConstraint(SpringLayout.WEST, Thermostat,
                     5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, Thermostat,
                  r14,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, plusButton14,
                    plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, plusButton14,
                    r14-5,
                     SpringLayout.NORTH, contentPane);
    // add miss button 1-30-2017 revision
    layout.putConstraint(SpringLayout.WEST, missButton14,
                    minusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, missButton14,
                   r14-5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitThermostatGasket,
                 c1,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitThermostatGasket,
                  r14,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitRTV,
                 c2,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitRTV,
                  r14,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitRadiatorHose2,
                 c3,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitRadiatorHose2,
                  r14,
                        SpringLayout.NORTH, contentPane);
    //Set up 15th row
    
    layout.putConstraint(SpringLayout.WEST, WaterPump,
                     5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, WaterPump,
                  r15,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, plusButton15,
                    plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, plusButton15,
                   r15-5,
                     SpringLayout.NORTH, contentPane);
    // add miss button 1-30-2017 revision
    layout.putConstraint(SpringLayout.WEST, missButton15,
                    minusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, missButton15,
                   r15-5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitBelt3,
                 c1,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitBelt3,
                  r15,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitRTV2,
                 c2,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitRTV2,
                r15,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitRadiatorHose3,
                 c3,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitRadiatorHose3,
                  r15,
                        SpringLayout.NORTH, contentPane);
    //Set up 16th row
    
    layout.putConstraint(SpringLayout.WEST, Wipers,
                     5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, Wipers,
                  r16,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, plusButton16,
                    plusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, plusButton16,
                   r16-5,
                     SpringLayout.NORTH, contentPane);
    // add miss button 1-30-2017 revision
    layout.putConstraint(SpringLayout.WEST, missButton16,
                    minusC,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, missButton16,
                   r16-5,
                     SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitWasherFluid,
                 c1,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitWasherFluid,
                  r16,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, HitGlassCleaner,
                 c2,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, HitGlassCleaner,
                r16,
                        SpringLayout.NORTH, contentPane);
    
    
    // add horizontal separators
    layout.putConstraint(SpringLayout.WEST, sep17,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep17,
              r1 -5,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep1,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep1,
              r1+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep2,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep2,
              r2+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep3,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep3,
             r3+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep4,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep4,
             r4+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep5,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep5,
             r5+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep6,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep6,
              r6+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep7,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep7,
             r7+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep8,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep8,
              r8+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep9,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep9,
              r9+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep10,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep10,
              r10+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep11,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep11,
             r11+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep12,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep12,
              r12+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep13,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep13,
              r13+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep14,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep14,
              r14+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep15,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep15,
              r14+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep16,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep16,
              r14+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep18,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep18,
              r15+ sepadd,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, sep19,
                    0,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, sep19,
              r16+ sepadd,
                        SpringLayout.NORTH, contentPane);
    //add vertical seperators
    layout.putConstraint(SpringLayout.WEST, vsep1,
                    c1-5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, vsep1,
             r1-5,
                        SpringLayout.NORTH, contentPane);
    layout.putConstraint(SpringLayout.WEST, vsep2,
                    plusC - 5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, vsep2,
              r1-5,
                        SpringLayout.NORTH, contentPane);
     layout.putConstraint(SpringLayout.WEST, vsep3,
                    plusC + 100,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, vsep3,
              r1-5,
                        SpringLayout.NORTH, contentPane);
     // Add Labels
    contentPane.add(CheckOutChallenge);
    contentPane.add(WCounter);
    contentPane.add(COCButton);
    contentPane.add(WMissCounter);
    contentPane.add(RewardCounterLabel);
    contentPane.add(RewardButton);
    //add header labels
    contentPane.add(soldLabel);
    contentPane.add(wittdtjrProducts);
    contentPane.add(hitOrMiss);
    // add form buttons for product sold
    
    contentPane.add(OilFilter);
    contentPane.add(plusButton);
    contentPane.add(missButton);
    
    contentPane.add(AirFilter);
    contentPane.add(plusButton2);
    contentPane.add(missButton2);
    
    contentPane.add (BrakePads);
    contentPane.add(plusButton3);
    contentPane.add(missButton3);
    
    contentPane.add (BrakeRotors);
    contentPane.add(plusButton4);
    contentPane.add(missButton4);
    
    contentPane.add (BrakeCalipers);
    contentPane.add(plusButton5);
    contentPane.add(missButton5);
    
    contentPane.add (Battery);
    contentPane.add(plusButton6);
    contentPane.add(missButton6);
    
    contentPane.add (Belt);
    contentPane.add(plusButton7);
    contentPane.add(missButton7);
    
    contentPane.add (Compressor);
    contentPane.add(plusButton8);
    contentPane.add(missButton8);
    
    contentPane.add (Alternator);
    contentPane.add(plusButton9);
    contentPane.add(missButton9);
    
    contentPane.add (FuelPump);
    contentPane.add(plusButton10);
    contentPane.add(missButton10);
  
    contentPane.add (MasterCyl);
    contentPane.add(plusButton11);
    contentPane.add(missButton11);
    
    contentPane.add (Radiator); 
    contentPane.add(plusButton12);
    contentPane.add(missButton12);
    
    contentPane.add (SparkPlugs);
    contentPane.add(plusButton13);
    contentPane.add(missButton13);
   
    contentPane.add (Thermostat);
    contentPane.add(plusButton14);
    contentPane.add(missButton14);
    
    contentPane.add (WaterPump); 
    contentPane.add(plusButton15);
    contentPane.add(missButton15);
    
    contentPane.add (Wipers); 
    contentPane.add(plusButton16);
    contentPane.add(missButton16);
    
    
    // add text for the possible hits
    contentPane.add(HitAirFilter);
    contentPane.add( HitPCVValve );
    contentPane.add( HitPCVValve2 );
    contentPane.add( HitFuelFilter);
    contentPane.add( HitRotors );
    contentPane.add( HitBrakeKit );
    contentPane.add( HitBrakeCleaner );
    contentPane.add( HitBrakePads );
    contentPane.add( HitBrakeKit2 );
    contentPane.add( HitBrakePads2 );
    contentPane.add( HitBrakeHoses );
    contentPane.add( HitRotors2 );
    contentPane.add( HitBrakeHardware );
    contentPane.add( HitBatteryCable );
    contentPane.add( HitBatteryGrease );
    contentPane.add( HitBeltTool );
    contentPane.add( HitBeltTensioner );
    contentPane.add( HitBeltIdler );
    contentPane.add( HitAccumulator );
    contentPane.add( HitOrficeTube );
    contentPane.add( HitBelt );
    contentPane.add( HitBelt2 );
    contentPane.add( HitBeltTool2 );
    contentPane.add( HitStrainer  );
    contentPane.add( HitFuelFilter2);
    contentPane.add( HitBrakeFluid );
    contentPane.add( HitRadiatorCap );
    contentPane.add( HitRadiatorHose );
    contentPane.add( HitThermostat );
    contentPane.add( HitWireSet );
    contentPane.add( HitDistributorCap );
    contentPane.add( HitIgnitionRotor );
    contentPane.add( HitThermostatGasket );
    contentPane.add( HitRTV );
    contentPane.add( HitRadiatorHose2 );
    contentPane.add( HitBelt3 );
    contentPane.add( HitRTV2 );
    contentPane.add( HitRadiatorHose3 );
    contentPane.add( HitWasherFluid );
    contentPane.add( HitGlassCleaner );
    
    // add horizontal seperators
    contentPane.add( sep1 );
    contentPane.add( sep2 );
    contentPane.add( sep3 );
    contentPane.add( sep4 );
    contentPane.add( sep5 );
    contentPane.add( sep6 );
    contentPane.add( sep7 );
    contentPane.add( sep8 );
    contentPane.add( sep9 );
    contentPane.add( sep10 );
    contentPane.add( sep11);
    contentPane.add( sep12 );
    contentPane.add( sep13 );
    contentPane.add( sep14 );
    contentPane.add( sep15 );
    contentPane.add( sep16 );
    contentPane.add( sep17 );
    contentPane.add( sep18);
    contentPane.add( sep19);
    
    // add vertical seperators
    contentPane.add( vsep1 );
    contentPane.add( vsep2 );
    contentPane.add( vsep3 );
    
    
    
    
     
    pack();
    frame1.setVisible(true);
    }

     
    public void setVisible(boolean bool) {
        frame1.setVisible(bool);
    }
}
// Add Zoner
 class AddZoner extends JFrame implements ActionListener {
    private JTextField NewZoner;
    public int XCounter = 0;
    
    public AddZoner()
    {
      JLabel AddLabel;  
      
      // if first run import the global list into the model
    if (firstrun == 0){
      String[] CurrentZoners = Globals.CurrentZonersArray.toArray(new String[0]);
       for(String val : CurrentZoners)
         Globals.listModel.addElement(val);
        firstrun= 1;
    }
   
    JFrame frame = new JFrame("Add Zoners");
    frame.setSize(1280, 780);
    
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    JList jlist = new JList(Globals.listModel);
    jlist.setFont(new Font("Serif", Font.BOLD, 24));
    Container contentPane = frame.getContentPane();
   // Define Parts of ui
   
    AddLabel = new JLabel("Enter New Zoner's Name :",JLabel.LEFT);
    AddLabel.setFont(new Font("Serif", Font.BOLD, 24));
    NewZoner = new JTextField(25);
    // set the box big enough to tap on the screen
    
    NewZoner.setPreferredSize(new Dimension(120,48));
    NewZoner.setFont(new Font("Serif", Font.BOLD, 24));
    NewZoner.addActionListener(this);
    JScrollPane scrollPane1 = new JScrollPane(jlist);
    
    //Set up Gui
    SpringLayout layout = new SpringLayout();
    contentPane.setLayout(layout);
    //Adjust constraints for the label so it's at (5,5).
    layout.putConstraint(SpringLayout.WEST, AddLabel,
                    5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, AddLabel,
                    5,
                        SpringLayout.NORTH, contentPane);
    //Adjust constraints for the text field so it's at
    //(<label's right edge> + 5, 5).
    layout.putConstraint(SpringLayout.WEST, NewZoner,
                     5,
                     SpringLayout.EAST, AddLabel);
    layout.putConstraint(SpringLayout.NORTH, NewZoner,
                     5,
                     SpringLayout.NORTH, contentPane);
    // Set Container Springs
    layout.putConstraint(SpringLayout.EAST, contentPane,
                     5,
                     SpringLayout.EAST, NewZoner);
    layout.putConstraint(SpringLayout.SOUTH, contentPane,
                     5,
                     SpringLayout.SOUTH, NewZoner);   
    // Set Container height to scrolllist 
    layout.putConstraint(SpringLayout.SOUTH, contentPane,
                     5,
                     SpringLayout.SOUTH, scrollPane1);  
     //Adjust constraints for the Label field so it's at
    //(Scroll list's right edge> + 5, 5).
    layout.putConstraint(SpringLayout.WEST, AddLabel,
                     5,
                     SpringLayout.EAST, scrollPane1);
    layout.putConstraint(SpringLayout.NORTH, scrollPane1,
                     5,
                     SpringLayout.NORTH, contentPane);
    
    
    // add parts to content pane
    contentPane.add(scrollPane1);
    contentPane.add(AddLabel); 
    contentPane.add(NewZoner);
   
      
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
   
        
 

   public void actionPerformed(ActionEvent evt) {
        
        String text = NewZoner.getText();
        
        String blank = ("");
        
      if (text.equals(blank)){ 
         JOptionPane.showMessageDialog(null, "You forgot to add a name");
          
      }
      else{
          // add catch for unique name if not add a letter X to name
         if (Globals.CurrentZonersArray.contains(text)){
             XCounter= XCounter + 1;
             text =text + XCounter;
             
            
             Globals.CurrentZonersArray.add(new String(text));
             Globals.listModel.addElement(text);
             Globals.comboBox.addItem(text);
             
      
      NewZoner.setText("");
       try {
         /* pane.getStyledDocument().insertString(
              0,
              "Zoner ["
                  + text+ "] added!\n",
              null);*/
        } catch (Exception ex) {
          ex.printStackTrace();
        }}
         else
         {         
      Globals.CurrentZonersArray.add(new String(text));
      Globals.listModel.addElement(text);
      Globals.comboBox.addItem(text);
     
      
      NewZoner.setText("");
       try {
          /*pane.getStyledDocument().insertString(
              0,
              "Zoner ["
                  + text+ "] added!\n",
              null);*/
        } catch (Exception ex) {
          ex.printStackTrace();
        }
      }}
   }}
      
           
           
       
      
 


    class DeleteZoner extends JFrame{
    public DeleteZoner()
    {
        
   
    // import the global list into the model
    
    
     if (firstrun == 0){   
     String[] CurrentZoners = Globals.CurrentZonersArray.toArray(new String[0]);
     for(String val : CurrentZoners)
     Globals.listModel.addElement(val);   
    firstrun = 1;
     }
    JFrame frame = new JFrame("Delete Zoners");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    Container contentPane = frame.getContentPane();

    JList jlist = new JList(Globals.listModel);
    jlist.setFont(new Font("Serif", Font.BOLD, 24));
    JScrollPane scrollPane1 = new JScrollPane(jlist);
    JLabel AddLabel = new JLabel("Double Click the Zoner to remove from the list:",JLabel.LEFT);
    AddLabel.setFont(new Font("Serif", Font.BOLD, 24));
    
    
    
    //Set up Gui
    SpringLayout layout = new SpringLayout();
    contentPane.setLayout(layout);
    //Adjust constraints for the label so it's at (5,5).
    layout.putConstraint(SpringLayout.WEST, AddLabel,
                    5,
                     SpringLayout.WEST, contentPane);
    layout.putConstraint(SpringLayout.NORTH, AddLabel,
                    5,
                        SpringLayout.NORTH, contentPane);
        // Set Container height to scrolllist 
    layout.putConstraint(SpringLayout.SOUTH, contentPane,
                     5,
                     SpringLayout.SOUTH, scrollPane1);  
     //Adjust constraints for the Label field so it's at
    //(Scroll list's right edge> + 5, 5).
    layout.putConstraint(SpringLayout.WEST, AddLabel,
                     5,
                     SpringLayout.EAST, scrollPane1);
    layout.putConstraint(SpringLayout.NORTH, scrollPane1,
                     5,
                     SpringLayout.NORTH, contentPane);
    
    // add content to pane
    contentPane.add(scrollPane1);
    contentPane.add(AddLabel); 
    
// mouse event listener

    MouseListener mouseListener = new MouseAdapter() {
      public void mouseClicked(MouseEvent mouseEvent) {
        JList theList = (JList) mouseEvent.getSource();
        if (mouseEvent.getClickCount() == 2) {
            
          // assign index to the item in the list that is double clicked  
          int index = theList.locationToIndex(mouseEvent.getPoint());
          if (index >= 0) {
           Object o = theList.getModel().getElementAt(index);
           // insert switch to display the correct tracker and delete the data
           switch (index)
           {
               case 0:
               {
                    tracker1.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker1.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker1.wHitCounter = 0;
                         tracker1.WCounter.setText("WITTDTJR Hits: " + tracker1.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker1.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker1.wMissCounter = 0;
                         tracker1.WMissCounter.setText("WITTDTJR Misses: " + tracker1.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker1.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker1.COCCounter = 0;
                         tracker1.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker1.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker1.frame1.setTitle("Zoner: " + "Deleted");
                         // set globals
                         Globals.RewardTotal = Globals.RewardTotal - tracker1.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker1.RewardCounter = 0;
                        
                     }
                     tracker1.setVisible(false);
                     break;
               }
               case 1:
               {
                    tracker2.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker2.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker2.wHitCounter = 0;
                         tracker2.WCounter.setText("WITTDTJR Hits: " + tracker2.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker2.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker2.wMissCounter = 0;
                         tracker2.WMissCounter.setText("WITTDTJR Misses: " + tracker2.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker2.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker2.COCCounter = 0;
                         tracker2.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker2.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker2.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker2.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker2.RewardCounter = 0;
                     }
                     tracker2.setVisible(false);
                     break;
               }
               case 2:
               {
                    tracker3.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker3.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker3.wHitCounter = 0;
                         tracker3.WCounter.setText("WITTDTJR Hits: " + tracker3.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker3.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker3.wMissCounter = 0;
                         tracker3.WMissCounter.setText("WITTDTJR Misses: " + tracker3.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker3.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker3.COCCounter = 0;
                         tracker3.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker3.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker3.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker3.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker3.RewardCounter = 0;
                     }
                     tracker3.setVisible(false);
                     break;
               }
               case 3:
               {
                    tracker4.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker4.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker4.wHitCounter = 0;
                         tracker4.WCounter.setText("WITTDTJR Hits: " + tracker4.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker4.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker4.wMissCounter = 0;
                         tracker4.WMissCounter.setText("WITTDTJR Misses: " + tracker4.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker4.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker4.COCCounter = 0;
                         tracker4.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker4.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker4.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker4.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker4.RewardCounter = 0;
                     }
                     tracker4.setVisible(false);
                     break;
               }
                case 4:
               {
                    tracker5.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker5.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker5.wHitCounter = 0;
                         tracker5.WCounter.setText("WITTDTJR Hits: " + tracker5.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker5.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker5.wMissCounter = 0;
                         tracker5.WMissCounter.setText("WITTDTJR Misses: " + tracker5.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker5.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker5.COCCounter = 0;
                         tracker5.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker5.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker5.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker5.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker5.RewardCounter = 0;
                     }
                     tracker5.setVisible(false);
                     break;
               }
                case 5:
               {
                    tracker6.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker6.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker6.wHitCounter = 0;
                         tracker6.WCounter.setText("WITTDTJR Hits: " + tracker6.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker6.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker6.wMissCounter = 0;
                         tracker6.WMissCounter.setText("WITTDTJR Misses: " + tracker6.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker6.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker6.COCCounter = 0;
                         tracker6.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker6.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker6.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker6.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker6.RewardCounter = 0;
                         
                     }
                     tracker6.setVisible(false);
                     break;
               }
                case 6:
               {
                    tracker7.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker7.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker7.wHitCounter = 0;
                         tracker7.WCounter.setText("WITTDTJR Hits: " + tracker7.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker7.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker7.wMissCounter = 0;
                         tracker7.WMissCounter.setText("WITTDTJR Misses: " + tracker7.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker7.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker7.COCCounter = 0;
                         tracker7.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker7.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker7.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker7.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker7.RewardCounter = 0;
                     }
                     tracker7.setVisible(false);
                     break;
               }
                case 7:
               {
                    tracker8.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker8.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker8.wHitCounter = 0;
                         tracker8.WCounter.setText("WITTDTJR Hits: " + tracker8.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker8.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker8.wMissCounter = 0;
                         tracker8.WMissCounter.setText("WITTDTJR Misses: " + tracker8.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker8.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker8.COCCounter = 0;
                         tracker8.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker8.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker8.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker8.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker8.RewardCounter = 0;
                     }
                     tracker8.setVisible(false);
                     break;
               }
                case 8:
               {
                    tracker9.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker9.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker9.wHitCounter = 0;
                         tracker9.WCounter.setText("WITTDTJR Hits: " + tracker9.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker9.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker9.wMissCounter = 0;
                         tracker9.WMissCounter.setText("WITTDTJR Misses: " + tracker9.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker9.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker9.COCCounter = 0;
                         tracker9.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker9.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker9.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker8.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker8.RewardCounter = 0;
                     }
                     tracker9.setVisible(false);
                     break;
               }
                case 9:
               {
                    tracker10.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker10.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker10.wHitCounter = 0;
                         tracker10.WCounter.setText("WITTDTJR Hits: " + tracker10.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker10.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker10.wMissCounter = 0;
                         tracker10.WMissCounter.setText("WITTDTJR Misses: " + tracker10.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker10.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker10.COCCounter = 0;
                         tracker10.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker10.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker10.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker10.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker10.RewardCounter = 0;
                     }
                     tracker10.setVisible(false);
                     break;
               }
                case 10:
               {
                    tracker11.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker11.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker11.wHitCounter = 0;
                         tracker11.WCounter.setText("WITTDTJR Hits: " + tracker11.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker11.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker11.wMissCounter = 0;
                         tracker11.WMissCounter.setText("WITTDTJR Misses: " + tracker11.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker11.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker11.COCCounter = 0;
                         tracker11.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker11.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker11.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker11.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker11.RewardCounter = 0;
                     }
                     tracker11.setVisible(false);
                     break;
               }
                case 11:
               {
                    tracker12.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker12.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker12.wHitCounter = 0;
                         tracker12.WCounter.setText("WITTDTJR Hits: " + tracker12.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker12.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker12.wMissCounter = 0;
                         tracker12.WMissCounter.setText("WITTDTJR Misses: " + tracker12.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker12.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker12.COCCounter = 0;
                         tracker12.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker12.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker12.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker12.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker12.RewardCounter = 0;
                     }
                     tracker12.setVisible(false);
                     break;
               }
                case 12:
               {
                    tracker13.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker13.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker13.wHitCounter = 0;
                         tracker13.WCounter.setText("WITTDTJR Hits: " + tracker13.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker13.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker13.wMissCounter = 0;
                         tracker13.WMissCounter.setText("WITTDTJR Misses: " + tracker13.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker13.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker13.COCCounter = 0;
                         tracker13.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker13.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker13.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker13.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker13.RewardCounter = 0;
                     }
                     tracker13.setVisible(false);
                     break;
               }
                case 13:
               {
                    tracker14.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker14.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker14.wHitCounter = 0;
                         tracker14.WCounter.setText("WITTDTJR Hits: " + tracker14.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker14.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker14.wMissCounter = 0;
                         tracker14.WMissCounter.setText("WITTDTJR Misses: " + tracker14.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker14.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker14.COCCounter = 0;
                         tracker14.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker14.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker14.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker14.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker14.RewardCounter = 0;
                     }
                     tracker14.setVisible(false);
                     break;
               }
                case 14:
               {
                    tracker15.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker15.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker15.wHitCounter = 0;
                         tracker15.WCounter.setText("WITTDTJR Hits: " + tracker15.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker15.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker15.wMissCounter = 0;
                         tracker15.WMissCounter.setText("WITTDTJR Misses: " + tracker15.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker15.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker15.COCCounter = 0;
                         tracker15.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker15.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker15.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker15.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker15.RewardCounter = 0;
                     }
                     tracker15.setVisible(false);
                     break;
               }
                case 15:
               {
                    tracker16.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker16.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker16.wHitCounter = 0;
                         tracker16.WCounter.setText("WITTDTJR Hits: " + tracker16.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker16.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker16.wMissCounter = 0;
                         tracker16.WMissCounter.setText("WITTDTJR Misses: " + tracker16.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker16.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker16.COCCounter = 0;
                         tracker16.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker16.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker16.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker16.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker16.RewardCounter = 0;
                     }
                     tracker16.setVisible(false);
                     break;
               }
                case 16:
               {
                    tracker17.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker17.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker17.wHitCounter = 0;
                         tracker17.WCounter.setText("WITTDTJR Hits: " + tracker17.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker17.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker17.wMissCounter = 0;
                         tracker17.WMissCounter.setText("WITTDTJR Misses: " + tracker17.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker17.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker17.COCCounter = 0;
                         tracker17.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker17.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker17.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker17.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker17.RewardCounter = 0;
                     }
                     tracker17.setVisible(false);
                     break;
               }
                case 17:
               {
                    tracker18.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker18.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker18.wHitCounter = 0;
                         tracker18.WCounter.setText("WITTDTJR Hits: " + tracker18.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker18.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker18.wMissCounter = 0;
                         tracker18.WMissCounter.setText("WITTDTJR Misses: " + tracker18.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker18.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker18.COCCounter = 0;
                         tracker18.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker18.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker18.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker18.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker18.RewardCounter = 0;
                     }
                     tracker18.setVisible(false);
                     break;
               }
                case 18:
               {
                    tracker19.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker19.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker19.wHitCounter = 0;
                         tracker19.WCounter.setText("WITTDTJR Hits: " + tracker19.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker19.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker19.wMissCounter = 0;
                         tracker19.WMissCounter.setText("WITTDTJR Misses: " + tracker19.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker19.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker19.COCCounter = 0;
                         tracker19.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker19.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker19.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker19.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker19.RewardCounter = 0;
                     }
                     tracker19.setVisible(false);
                     break;
               }
                case 19:
               {
                    tracker20.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker20.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker20.wHitCounter = 0;
                         tracker20.WCounter.setText("WITTDTJR Hits: " + tracker20.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker20.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker20.wMissCounter = 0;
                         tracker20.WMissCounter.setText("WITTDTJR Misses: " + tracker20.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker20.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker20.COCCounter = 0;
                         tracker20.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker20.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker20.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker20.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker20.RewardCounter = 0;
                     }
                     tracker20.setVisible(false);
                     break;
               }
                case 20:
               {
                    tracker21.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker21.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker21.wHitCounter = 0;
                         tracker21.WCounter.setText("WITTDTJR Hits: " + tracker21.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker21.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker21.wMissCounter = 0;
                         tracker21.WMissCounter.setText("WITTDTJR Misses: " + tracker21.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker21.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker21.COCCounter = 0;
                         tracker21.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker21.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker21.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker21.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker21.RewardCounter = 0;
                     }
                     tracker21.setVisible(false);
                     break;
               }
                case 21:
               {
                    tracker22.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker22.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker22.wHitCounter = 0;
                         tracker22.WCounter.setText("WITTDTJR Hits: " + tracker22.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker22.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker22.wMissCounter = 0;
                         tracker22.WMissCounter.setText("WITTDTJR Misses: " + tracker22.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker22.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker22.COCCounter = 0;
                         tracker22.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker22.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker22.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker22.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker22.RewardCounter = 0;
                     }
                     tracker22.setVisible(false);
                     break;
               }
                case 22:
               {
                    tracker23.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker23.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker23.wHitCounter = 0;
                         tracker23.WCounter.setText("WITTDTJR Hits: " + tracker23.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker23.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker23.wMissCounter = 0;
                         tracker23.WMissCounter.setText("WITTDTJR Misses: " + tracker23.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker23.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker23.COCCounter = 0;
                         tracker23.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker23.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker23.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker23.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker23.RewardCounter = 0;
                     }
                     tracker23.setVisible(false);
                     break;
               }
                case 23:
               {
                    tracker24.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker24.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker24.wHitCounter = 0;
                         tracker24.WCounter.setText("WITTDTJR Hits: " + tracker24.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker24.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker24.wMissCounter = 0;
                         tracker24.WMissCounter.setText("WITTDTJR Misses: " + tracker24.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker24.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker24.COCCounter = 0;
                         tracker24.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker24.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker24.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker24.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker24.RewardCounter = 0;
                     }
                     tracker24.setVisible(false);
                     break;
               }
                case 24:
               {
                    tracker25.setVisible(true);
                         // Remove Deleted Zoners stats from gloabal totals
                     if (Globals.deleted = true)
                     {
                         // Set globals
                         Globals.WHitTotal = Globals.WHitTotal - tracker25.wHitCounter;
                         Globals.WHitT.setText ("WITTDTJR Hits: " + Globals.WHitTotal);
                         // Reset deleted
                         tracker25.wHitCounter = 0;
                         tracker25.WCounter.setText("WITTDTJR Hits: " + tracker25.wHitCounter);
                         // Set globals 
                         Globals.WMissTotal = Globals.WMissTotal - tracker25.wMissCounter; 
                         Globals.WMissT.setText ("WITTDTJR Misses: " + Globals.WMissTotal);
                         // reset deleted
                         tracker25.wMissCounter = 0;
                         tracker25.WMissCounter.setText("WITTDTJR Misses: " + tracker25.wMissCounter);
                         // set globals
                         Globals.COCTotal = Globals.COCTotal - tracker25.COCCounter; 
                         Globals.COCT.setText("Check Out Challenge Hits: " + Globals.COCTotal );
                         //reset deleted
                         tracker25.COCCounter = 0;
                         tracker25.CheckOutChallenge.setText("Check Out Challenge Hits: " + tracker25.COCCounter);
                         // reset deleted flag
                         Globals.deleted = false;
                         tracker25.frame1.setTitle("Zoner: " + "Deleted");
                         Globals.RewardTotal = Globals.RewardTotal - tracker25.RewardCounter; 
                         Globals.RewardTotalLabel.setText("New Reward Cards Given: " + Globals.RewardTotal );
                         //reset deleted
                         tracker25.RewardCounter = 0;
                     }
                     tracker25.setVisible(false);
                     break;
               }
           }
               
           Globals.listModel.remove(index);
           Globals.listModel.add(index, "Deleted");
           Globals.CurrentZonersArray.remove(o.toString());
//           // add array compression
//            
//  
//           Globals.CurrentZonersArray.removeAll(Collections.singleton(null));
//           Globals.CurrentZonersArray.toArray(new String[Globals.CurrentZonersArray.size()]);
        
    
           Globals.CurrentZonersArray.add(index, "Deleted");
           Globals.comboBox.removeItem(o);
           Globals.comboBox.addItem("Deleted");
           Globals.deleted = true;
          
           
            try {
          /*pane.getStyledDocument().insertString(
              0,
              "Zoner ["
                  + o + "] Removed!\n",
              null);*/
        } catch (Exception ex) {
          ex.printStackTrace();
        }
            
          }
        }
      }
    };
    jlist.addMouseListener(mouseListener);

    frame.setSize(1280, 780);
    frame.setVisible(true);
  
    
    
    
    }}
    
 

  public AutoZoneWITTDTJR() {
      
   
    // Initializes the List
    String[] CurrentZoners = Globals.CurrentZonersArray.toArray(new String[0]);
    
    //
      
    
    // Creates the menu
    menuBar = new JMenuBar();
    java.net.URL imageURL = AutoZoneWITTDTJR.class.getResource("add.gif");
    java.net.URL imageURL2 = AutoZoneWITTDTJR.class.getResource("remove.gif");
        Action addNewZoner = new Action("Add", new ImageIcon(imageURL), "Add New Zoner",'A');
    Action removeZoner = new Action("Remove", new ImageIcon(imageURL2), "Remove Zoner", 'R');
    JMenu formatMenu = new JMenu("Zoner Menu");
    formatMenu.add(addNewZoner);
    formatMenu.add(removeZoner);
    menuBar.add(formatMenu);
    toolBar = new JToolBar("Zoner Tool Bar");
    toolBar.add(addNewZoner);
    toolBar.add(removeZoner);
     JLabel label = new JLabel("Zoner");
    toolBar.add(label);
    toolBar.addSeparator();
    
    
    
  
    
   
   
    
    // Creates the drop down box
    
    DefaultComboBoxModel comboModel = new DefaultComboBoxModel(CurrentZoners);
    Font f = new Font("Serif", Font.BOLD, 36);
    Globals.comboBox.setFont(f);
    
    Globals.comboBox.setModel(comboModel );
   
    Globals.comboBox.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
         
          String[] CurrentZoners = Globals.CurrentZonersArray.toArray(new String[0]);
          Object choice =((JComboBox) e.getSource())
                      .getSelectedItem();
          // create the null forms
     
          if (choice != null ){
          temp = choice.toString();
          }
                  Map<Integer, String> map = new HashMap<>();
          
                   for (int x=0; x < CurrentZoners.length; x ++)
                   {
                   map.put(x,CurrentZoners[x]);
                   }
                          
                   for (Map.Entry<Integer, String> entry : map.entrySet()) {
		//System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
	
                  
                   
                if (  entry.getValue().equals(temp)) 
                {
                i = entry.getKey();
                
                /*
                System.out.println("value of value : " + entry.getValue());
                System.out.println("value of key : " + entry.getKey());
                System.out.println("value of i : " + i);
                System.out.println("value of choice : " + temp);
                */
                }
                else
                {
                   i = 25;
                  /*
                System.out.println("Failed to match value to choice");
                System.out.println("value of value : " + entry.getValue());
                System.out.println("value of key : " + entry.getKey());
                System.out.println("value of i : " + i);
                System.out.println("value of choice : " + temp);
                  */
};
 
 
           
                  
      
          
                                  
    
         
           
              if (choice != null && choice !="Deleted" ){
                 
          // add switch to keep track of the forms
          switch (i){
              case 0 : 
                  if(tracker1 == null) {
            tracker1 = new Tracker();
        } else {
                 
            tracker1.setVisible(true);
      
        }
                 
                 
                  
              break;
              case 1 : if(tracker2 == null) {
            tracker2 = new Tracker();
        } else {
                   
            tracker2.setVisible(true);
        }
              break;
              case 2 :if(tracker3 == null) {
            tracker3 = new Tracker();
        } else {
                   
            tracker3.setVisible(true);
        }
              break;
              case 3 : if(tracker4 == null) {
            tracker4 = new Tracker();
        } else {
                   
            tracker4.setVisible(true);
        }
              break;
              case 4 : if(tracker5 == null) {
            tracker5 = new Tracker();
        } else {
                   
            tracker5.setVisible(true);
        }
              break;
              case 5 : if(tracker6 == null) {
            tracker6 = new Tracker();
        } else {
                   
            tracker6.setVisible(true);
        }
              break;
              case 6 : if(tracker7 == null) {
            tracker7 = new Tracker();
        } else {
                   
            tracker7.setVisible(true);
        }
              break;
              case 7 :if(tracker8 == null) {
            tracker8 = new Tracker();
        } else {
                   
            tracker8.setVisible(true);
        }
              break;
              case 8 : if(tracker9 == null) {
            tracker9 = new Tracker();
        } else {
                   
            tracker9.setVisible(true);
        }
              break;
              case 9 : if(tracker10 == null) {
            tracker10 = new Tracker();
        } else {
                   
            tracker10.setVisible(true);
        }
              break;
              case 10 : if(tracker11 == null) {
            tracker11 = new Tracker();
        } else {
                   
            tracker11.setVisible(true);
        }
              break;
              case 11 : if(tracker12 == null) {
            tracker12 = new Tracker();
        } else {
                   
            tracker12.setVisible(true);
        }
              break;
              case 12 : if(tracker13 == null) {
            tracker13 = new Tracker();
        } else {
                   
            tracker13.setVisible(true);
        }
              break;
              case 13 : if(tracker14 == null) {
            tracker14 = new Tracker();
        } else {
                   
            tracker14.setVisible(true);
        }
              break;
              case 14 : if(tracker15 == null) {
            tracker15 = new Tracker();
        } else {
                   
            tracker15.setVisible(true);
        }
              break;
              case 15 :if(tracker16 == null) {
            tracker16 = new Tracker();
        } else {
                   
            tracker16.setVisible(true);
        }
              break;
              case 16 :if(tracker17 == null) {
            tracker17 = new Tracker();
        } else {
                   
            tracker17.setVisible(true);
        }
              break;
              case 17 : if(tracker18 == null) {
            tracker18 = new Tracker();
        } else {
                   
            tracker18.setVisible(true);
        }
              break;
              case 18 : if(tracker19 == null) {
            tracker19 = new Tracker();
        } else {
                   
            tracker19.setVisible(true);
        }
              break;
              case 19 : if(tracker20 == null) {
            tracker20 = new Tracker();
        } else {
                   
            tracker20.setVisible(true);
        }
              break;
              case 20 : if(tracker21 == null) {
            tracker21 = new Tracker();
        } else {
                   
            tracker21.setVisible(true);
        }
              break;
              case 21 : if(tracker22 == null) {
            tracker22 = new Tracker();
        } else {
                   
            tracker22.setVisible(true);
        }
              break;
              case 22 : if(tracker23 == null) {
            tracker23 = new Tracker();
        } else {
                   
            tracker23.setVisible(true);
        }
              break;
              case 23 : if(tracker24 == null) {
            tracker24 = new Tracker();
        } else {
                   
            tracker24.setVisible(true);
        }
              break;
              case 24 : if(tracker25 == null) {
            tracker25 = new Tracker();
        } else {
                   
            tracker25.setVisible(true);
        }
              break;
               }
          }
                   }
         
          
          
          
        try {
          /*pane.getStyledDocument().insertString(
              0,
              "Zoner ["
                  + ((JComboBox) e.getSource())
                      .getSelectedItem() + "] chosen!\n",
              null);*/
        } catch (Exception ex) {
          ex.printStackTrace();
        }
      }
    });
  
    
     toolBar.add(Globals.comboBox); 
  }
 




   

  public static void main(String [] args) {
      
    Globals Init= new Globals();  
    AutoZoneWITTDTJR form = new AutoZoneWITTDTJR();
//    form.pane = new JTextPane();
//    form.pane.setPreferredSize(new Dimension(1280, 780));
//    form.pane.setBorder(new BevelBorder(BevelBorder.LOWERED));
    form.toolBar.setMaximumSize(form.toolBar.getSize());
    JFrame frame = new JFrame("AutoZone WITTDTJR");
    frame.setSize(800, 780);
    frame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    Container contentPane = frame.getContentPane();
    // add listener for mistaken exit
    frame.addWindowListener(new WindowAdapter(){
      @Override
        public void windowClosing(WindowEvent arg0) {
            int result = JOptionPane.showConfirmDialog((Component) null, "Do you REALLY want to exit and reset the daily totals ?!",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (result == 0) {
                System.exit(0);
            } else {

            }
    }
  });

    
    GridBagLayout layout = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    
    contentPane.setLayout(layout);
    frame.setJMenuBar(form.menuBar);
    gbc.fill =GridBagConstraints.NONE;
    gbc.anchor = GridBagConstraints.NORTHWEST;    
    gbc.gridx = 0;
    gbc.gridy = 0;
    contentPane.add(form.toolBar,gbc);
    gbc.fill =GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 1;
    contentPane.add(Globals.dateLabel,gbc);
    gbc.fill =GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 2;
    contentPane.add(Globals.COCT,gbc);
    gbc.fill =GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 3;
    contentPane.add(Globals.WHitT, gbc);
    gbc.fill =GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 4;
    contentPane.add(Globals.WMissT, gbc);
    gbc.fill =GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 5;
    contentPane.add(Globals.RewardTotalLabel, gbc);
    gbc.fill =GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 6;
    contentPane.add(Globals.TopSalesmanLabel, gbc);
    gbc.fill =GridBagConstraints.HORIZONTAL;
    gbc.gridx = 1;
    gbc.gridy = 0;
    //contentPane.add(form.pane,gbc);
    //frame.pack();
    frame.setVisible(true);
    
    
  
  }

  class Action extends AbstractAction {

    public Action(String text, Icon icon, String description,
        char accelerator) {
      super(text, icon);
      putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(accelerator,
          Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
      putValue(SHORT_DESCRIPTION, description);
    }

    public void actionPerformed(ActionEvent e ) {
      
          
          String currentAction = (String) getValue(NAME);
         if (currentAction == "Add")
         {
            //This is where the action has to happen for add 
             AddZoner AZ= new AddZoner();
             
         try {
             /*pane.getStyledDocument().insertString(0,
                     "Action [" + getValue(NAME) + "] performed!\n", null);*/
             }
         catch (Exception ex) {
        ex.printStackTrace();}
         }
         else // Current action Delete
             {
             //This is where the action has to happen for delete
             DeleteZoner DZ= new DeleteZoner();
         try {
             /*pane.getStyledDocument().insertString(0,
                     "Action [" + getValue(NAME) + "] performed!\n", null);*/
             }
         catch (Exception ex) {
        ex.printStackTrace();}
             }
       
      }
  }
  }

