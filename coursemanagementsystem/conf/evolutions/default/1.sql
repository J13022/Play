# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table administrator (
  administrator_id              integer auto_increment not null,
  password                      varchar(255),
  constraint pk_administrator primary key (administrator_id)
);

create table exam_report_schedule (
  term_code                     integer auto_increment not null,
  term                          varchar(255),
  task_deadline_day             datetime,
  exam_day                      datetime,
  exam_request_start_day        datetime,
  exam_request_end_day          datetime,
  constraint pk_exam_report_schedule primary key (term_code)
);

create table media_course (
  media_course_id               integer auto_increment not null,
  student_id                    varchar(255),
  subject_id                    varchar(255),
  task_submission_time          integer,
  exam_result                   varchar(255),
  evalution                     varchar(255),
  constraint pk_media_course primary key (media_course_id)
);

create table student (
  student_id                    varchar(255) not null,
  student_year                  varchar(255),
  student_name                  varchar(255),
  mail_address                  varchar(255),
  password                      varchar(255),
  goal_units                    integer,
  enrollment                    varchar(255),
  constraint pk_student primary key (student_id)
);

create table subject (
  subject_code                  varchar(255) not null,
  time_table_code               varchar(255),
  subject_name                  varchar(255),
  subject_classification        varchar(255),
  subject_category              varchar(255),
  standard_course_school_year   varchar(255),
  term_code1                    integer,
  term_code2                    integer,
  exam_time_table               varchar(255),
  unit                          integer,
  subject_level                 varchar(255),
  constraint pk_subject primary key (subject_code)
);

create table text_course (
  text_course_id                integer auto_increment not null,
  student_id                    varchar(255),
  subject_id                    varchar(255),
  report_a_result               varchar(255),
  report_b_result               varchar(255),
  exam_result                   varchar(255),
  evalution                     varchar(255),
  constraint pk_text_course primary key (text_course_id)
);


# --- !Downs

drop table if exists administrator;

drop table if exists exam_report_schedule;

drop table if exists media_course;

drop table if exists student;

drop table if exists subject;

drop table if exists text_course;

