package status;

/**
 *
 * @author Acer
 */
public class StatusViewer {
    public enum Status_Number {ZERO,ONE,TWO,THREE}
    public enum Status_Display {REJECTED, PENDING, PROCESSING, APPROVED}
    private Status_Number status_n;
    private Status_Display status_d;

    public StatusViewer(Status_Number status_n, Status_Display status_d_){
        this.status_d = status_d;
        this.status_n = status_n;
    }
    /**
     * @return the status_n
     */
    public Status_Number getStatus_n() {
        return status_n;
    }

    /**
     * @param status_n the status_n to set
     */
    public void setStatus_n(Status_Number status_n) {
        this.status_n = status_n;
    }

    /**
     * @return the status_d
     */
    public Status_Display getStatus_d() {
        return status_d;
    }

    /**
     * @param status_d the status_d to set
     */
    public void setStatus_d(Status_Display status_d) {
        this.status_d = status_d;
    }

   
    
}
