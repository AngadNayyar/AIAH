package net.socialgamer.cah.data;

import java.util.HashMap;
import java.util.Map;

import net.socialgamer.cah.Constants.WhiteCardData;


public abstract class WhiteCard {

  public abstract int getId();

  public abstract String getText();

  public abstract String getWatermark();

  public abstract boolean isWriteIn();

  // Abstract Getters
  public abstract double getSexual();

  public abstract double getPolitical();

  public abstract double getHuman();

  public abstract double getReligion();

  public abstract double getControversial();

  public abstract double getGross();

  public abstract double getScientific();

  public abstract double getRacism();

  public abstract double getLocation();

  public abstract double getCelebrity();

  public abstract double getRandom();

  // Abstract Setters
  public abstract void setRandom(double random);

  public abstract void setPolitical(double political);

  public abstract void setHuman(double human);

  public abstract void setReligion(double religion);

  public abstract void setControversial(double controversial);

  public abstract void setGross(double gross);

  public abstract void setScientific(double scientific);

  public abstract void setRacism(double racism);

  public abstract void setLocation(double location);

  public abstract void setCelebrity(double celebrity);

  public abstract void setSexual(double sexual);



  @Override
  public final boolean equals(final Object other) {
    if (!(other instanceof WhiteCard)) {
      return false;
    }
    return ((WhiteCard) other).getId() == getId();
  }

  @Override
  public final int hashCode() {
    return getId();
  }

  /**
   * @return Client representation of this card.
   */
  public Map<WhiteCardData, Object> getClientData() {
    final Map<WhiteCardData, Object> cardData = new HashMap<WhiteCardData, Object>();
    cardData.put(WhiteCardData.ID, getId());
    cardData.put(WhiteCardData.TEXT, getText());
    cardData.put(WhiteCardData.WATERMARK, getWatermark());
    cardData.put(WhiteCardData.WRITE_IN, isWriteIn());
    return cardData;
  }

  /**
   * @return Client representation of a face-down White Card.
   */
  public static final Map<WhiteCardData, Object> getFaceDownCardClientData() {
    final Map<WhiteCardData, Object> cardData = new HashMap<WhiteCardData, Object>();
    cardData.put(WhiteCardData.ID, -1);
    cardData.put(WhiteCardData.TEXT, "");
    cardData.put(WhiteCardData.WATERMARK, "");
    cardData.put(WhiteCardData.WRITE_IN, false);
    return cardData;
  }

  @Override
  public String toString() {
    return String.format("%s %s (id:%d, watermark:%s)", getClass().getName(), getText(), getId(),
        getWatermark());
  }

}
