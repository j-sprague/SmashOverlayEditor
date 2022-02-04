/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamprint;

/**
 *
 * @author jsman
 */
public class StreamInfo {
    
    private int win;

    private int loss;

    private String sr;
    
    public StreamInfo() {
        
    }
    
    /**
     * Get the value of sr
     *
     * @return the value of sr
     */
    public String getSr() {
        return sr;
    }

    /**
     * Set the value of sr
     *
     * @param sr new value of sr
     */
    public void setSr(String sr) {
        this.sr = sr;
    }

    /**
     * Get the value of loss
     *
     * @return the value of loss
     */
    public int getLoss() {
        return loss;
    }

    /**
     * Set the value of loss
     *
     * @param loss new value of loss
     */
    public void setLoss(int loss) {
        this.loss = loss;
    }

    /**
     * Get the value of win
     *
     * @return the value of win
     */
    public int getWin() {
        return win;
    }

    /**
     * Set the value of win
     *
     * @param win new value of win
     */
    public void setWin(int win) {
        this.win = win;
    }

}
