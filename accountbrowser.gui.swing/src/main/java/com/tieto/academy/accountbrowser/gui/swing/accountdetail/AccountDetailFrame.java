package com.tieto.academy.accountbrowser.gui.swing.accountdetail;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.tieto.academy.accountbrowser.gui.swing.accountdetail.action.FetchAccountDetailAction;

/**
 * Account detail GUI frame.
 * 
 * @author Ondrej Kvasnovsky
 */
public class AccountDetailFrame extends javax.swing.JFrame {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -8925910044871225957L;
    private JButton btnApprove;
    private JButton btnFetchAccountDetails;
    private JButton btnSave;
    private JLabel lblAccountId;
    private JLabel lblAccountState;
    private JLabel lblBalance;
    private JLabel lblCurrency;
    private JLabel lblOwnersName;
    private JPanel pnlAccountDetails;
    private JPanel pnlMain;
    private JTextField txtAccountId;
    private JTextField txtAccountState;
    private JTextField txtBalance;
    private JTextField txtOwnersName;

    /**
     * Creates new instance.
     */
    public AccountDetailFrame() {
        super("Account browser");
        this.initGUI();
    }

    /**
     * Returns btnApprove.
     * 
     * @return the btnApprove
     */
    public JButton getBtnApprove() {
        return btnApprove;
    }

    /**
     * Returns btnFetchAccountDetails.
     * 
     * @return the btnFetchAccountDetails
     */
    public JButton getBtnFetchAccountDetails() {
        return btnFetchAccountDetails;
    }

    /**
     * Returns btnSave.
     * 
     * @return the btnSave
     */
    public JButton getBtnSave() {
        return btnSave;
    }

    /**
     * Returns lblAccountId.
     * 
     * @return the lblAccountId
     */
    public JLabel getLblAccountId() {
        return lblAccountId;
    }

    /**
     * Returns lblAccountState.
     * 
     * @return the lblAccountState
     */
    public JLabel getLblAccountState() {
        return lblAccountState;
    }

    /**
     * Returns lblBalance.
     * 
     * @return the lblBalance
     */
    public JLabel getLblBalance() {
        return lblBalance;
    }

    /**
     * Returns lblCurrency.
     * 
     * @return the lblCurrency
     */
    public JLabel getLblCurrency() {
        return lblCurrency;
    }

    /**
     * Returns lblOwnersName.
     * 
     * @return the lblOwnersName
     */
    public JLabel getLblOwnersName() {
        return lblOwnersName;
    }

    /**
     * Returns pnlAccountDetails.
     * 
     * @return the pnlAccountDetails
     */
    public JPanel getPnlAccountDetails() {
        return pnlAccountDetails;
    }

    /**
     * Returns pnlMain.
     * 
     * @return the pnlMain
     */
    public JPanel getPnlMain() {
        return pnlMain;
    }

    /**
     * Returns txtAccountId.
     * 
     * @return the txtAccountId
     */
    public JTextField getTxtAccountId() {
        return txtAccountId;
    }

    /**
     * Returns txtAccountState.
     * 
     * @return the txtAccountState
     */
    public JTextField getTxtAccountState() {
        return txtAccountState;
    }

    /**
     * Returns txtBalance.
     * 
     * @return the txtBalance
     */
    public JTextField getTxtBalance() {
        return txtBalance;
    }

    /**
     * Returns txtOwnersName.
     * 
     * @return the txtOwnersName
     */
    public JTextField getTxtOwnersName() {
        return txtOwnersName;
    }

    private void initGUI() {
        try {
            this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            {
                this.pnlMain = new JPanel();
                final GridBagLayout pnlMainLayout = new GridBagLayout();
                pnlMainLayout.columnWidths = new int[] { 121, 169, 168 };
                pnlMainLayout.rowHeights = new int[] { 7, 7, 7 };
                pnlMainLayout.columnWeights = new double[] { 0.0, 0.0, 0.0 };
                pnlMainLayout.rowWeights = new double[] { 0.1, 0.1, 0.1 };
                this.getContentPane().add(this.getPnlMain(), BorderLayout.CENTER);
                this.pnlMain.setLayout(pnlMainLayout);
                {
                    this.lblAccountId = new JLabel();
                    this.pnlMain.add(this.getLblAccountId(), new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 0, 5), 0, 0));
                    this.lblAccountId.setText("Account number:");
                }
                {
                    this.txtAccountId = new JTextField();
                    this.pnlMain.add(this.getTxtAccountId(), new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 5, 0, 5), 0, 0));
                }
                {
                    this.btnFetchAccountDetails = new JButton();
                    this.pnlMain.add(this.btnFetchAccountDetails, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 5, 0, 5), 0, 0));
                    this.btnFetchAccountDetails.setText("Fetch account details");
                    this.btnFetchAccountDetails.setAction(new FetchAccountDetailAction(this, "Title"));
                }
                {
                    this.pnlAccountDetails = new JPanel();
                    final GridBagLayout pnlAccountDetailsLayout = new GridBagLayout();
                    pnlAccountDetailsLayout.columnWidths = new int[] { 121, 7, 20 };
                    pnlAccountDetailsLayout.rowHeights = new int[] { 7, 7, 7 };
                    pnlAccountDetailsLayout.columnWeights = new double[] { 0.0, 0.1, 0.1 };
                    pnlAccountDetailsLayout.rowWeights = new double[] { 0.1, 0.1, 0.0 };
                    this.pnlMain.add(this.pnlAccountDetails, new GridBagConstraints(0, 1, 3, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
                    this.pnlAccountDetails.setLayout(pnlAccountDetailsLayout);
                    this.pnlAccountDetails.setEnabled(false);
                    this.pnlAccountDetails.setBorder(BorderFactory.createTitledBorder("Account details"));
                    {
                        this.lblOwnersName = new JLabel();
                        this.pnlAccountDetails.add(this.lblOwnersName, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 5, 0, 5), 0, 0));
                        this.lblOwnersName.setText("Owner's name:");
                    }
                    {
                        this.lblBalance = new JLabel();
                        this.pnlAccountDetails.add(this.lblBalance, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                                GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 5, 0, 5), 0, 0));
                        this.lblBalance.setText("Balance:");
                    }
                    {
                        this.txtOwnersName = new JTextField();
                        this.pnlAccountDetails
                                .add(this.txtOwnersName, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                                        new Insets(0, 5, 5, 5), 0, 0));
                    }
                    {
                        this.txtBalance = new JTextField();
                        this.pnlAccountDetails
                                .add(this.txtBalance, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                                        new Insets(5, 5, 5, 5), 0, 0));
                    }
                    {
                        this.lblCurrency = new JLabel();
                        this.pnlAccountDetails.add(this.getLblCurrency(), new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                                GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 5, 0, 5), 0, 0));
                    }
                    {
                        this.lblAccountState = new JLabel();
                        this.pnlAccountDetails.add(this.getLblAccountState(), new GridBagConstraints(0, 2, 1, 1, 0.0,
                                0.0, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 0, 5), 0, 0));
                        this.lblAccountState.setText("Account state:");
                    }
                    {
                        this.txtAccountState = new JTextField();
                        this.pnlAccountDetails.add(this.getTxtAccountState(), new GridBagConstraints(1, 2, 1, 1, 0.0,
                                0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5),
                                0, 0));
                    }
                }
                {
                    this.btnSave = new JButton();
                    this.pnlMain.add(this.btnSave, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 5, 0, 5), 0, 0));
                    this.btnSave.setText("Save");
                }
                {
                    this.btnApprove = new JButton();
                    this.pnlMain.add(this.btnApprove, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 5, 0, 5), 0, 0));
                    this.btnApprove.setText("Approve");
                }
            }
            this.pack();
            this.setSize(475, 233);
        } catch (final Exception e) {
            // add your error handling code here
            e.printStackTrace();
        }
    }
}
