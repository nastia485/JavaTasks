package com.company.controller;

public interface RegexContainer {

    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";

    String REGEX_NAME_EN = "^[A-Za-z0-9_-]{8,20}$";

    String REGEX_LOGIN_UNI = "^[A-Za-z0-9_-]{8,20}$";

    String REGEX_SURNAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";

    String REGEX_SURNAME_EN = "^[A-Za-z0-9_-]{8,20}$";

    String REGEX_PATRONYMIC_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";

    String REGEX_COMMENT_UKR = "^[А-ЩЬЮЯҐІЇЄа-щьюяґіїє0-9 ]{1,100}$";

    String REGEX_COMMENT_EN = "*[A-Za-z ]{1,100}$";

    String REGEX_GROUP_UKR = "РОДИЧІ|РОБОТА|ДРУЗІ";

    String REGEX_GROUP_EN = "RELATIVES|WORK|FRIENDS";

    String REGEX_HOME_NUMBER_UNI = "^044-[0-9]{3}-[0-9]{2}-[0-9]{2}$";

    String REGEX_MOBILE_NUMBER_UNI = "^0[0-9]{2}-[0-9]{3}-[0-9]{2}-[0-9]{2}$";

    String REGEX_MOBILE2_NUMBER_UNI = "(0[0-9]{2}-[0-9]{3}-[0-9]{2}-[0-9]{2})|-";

    String REGEX_EMAIL_UNI = "^(.+)@(.+)$";

    String REGEX_SKYPE_UNI = "^@[A-Za-z0-9_-]+$";

    String REGEX_INDEX_UNI = "^[0-9]{5}$";

    String REGEX_CITY_UKR ="^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{2,30}$";

    String REGEX_CITY_EN ="^[A-Za-z]{2,30}$";

    String REGEX_STREET_UKR ="^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{2,30}$";

    String REGEX_STREET_EN ="^[A-Za-z]{2,30}$";

    String REGEX_HOUSE_NUMBER_UNI = "^[0-9]{1,3}$";

    String REGEX_FLAT_NUMBER_UNI = "([0-9]{1,3})|-";

    String REGEX_DATE_UNI = "^\\d\\d\\.\\d\\d\\.\\d\\d\\d\\d$";










}
