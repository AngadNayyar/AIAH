package net.socialgamer.cah.cardcast;

import net.socialgamer.cah.data.WhiteCard;


public class CardcastWhiteCard extends WhiteCard {

  private final int id;
  private final String text;
  private final String deckId;

  public CardcastWhiteCard(final int id, final String text, final String deckId) {
    this.id = id;
    this.text = text;
    this.deckId = deckId;
  }

  // This wont be used

  public void setDeathHarm(double deathHarm) {

  }

  public void setRandom(double random) {

  }

  public void setPolitical(double political) {

  }

  public void setHuman(double human) {

  }

  public void setReligion(double religion) {

  }

  public void setControversial(double controversial) {

  }

  public void setGross(double gross) {

  }

  public void setScientific(double scientific) {

  }

  public void setRacism(double racism) {

  }

  public void setLocation(double location) {

  }

  public void setCelebrity(double celebrity) {

  }

  public void setSexual(double sexual) {

  }

  public double getDeathHarm() {
    return 0;
  }

  public double getSexual() {
    return 0;
  }

  public double getPolitical() {
    return 0;
  }

  public double getHuman() {
    return 0;
  }

  public double getReligion() {
    return 0;
  }

  public double getControversial() {
    return 0;
  }

  public double getGross() {
    return 0;
  }

  public double getScientific() {
    return 0;
  }

  public double getRacism() {
    return 0;
  }

  public double getLocation() {
    return 0;
  }

  public double getCelebrity() {
    return 0;
  }

  public double getRandom() {
    return 0;
  }



  @Override
  public int getId() {
    return id;
  }

  @Override
  public String getText() {
    return text;
  }

  @Override
  public String getWatermark() {
    return deckId;
  }

  @Override
  public boolean isWriteIn() {
    return false;
  }

}
